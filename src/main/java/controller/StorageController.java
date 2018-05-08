package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import pojo.Page;
import pojo.Storage;
import service.StorageService;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    /**
     * 分页显示的公共方法
     * @param pageIndex
     * @param pageCount
     * @return
     */
    public Page getPage(Integer pageIndex,Integer pageCount){
        int total = storageService.selectCount(); //信息总数
        int pageTotal = total%pageCount==0?total/pageCount:total/pageCount+1;  //可分总页数
        Page page = new Page();
        page.setPageCount(pageCount);
        page.setPageIndex(pageIndex);
        page.setPageTotal(pageTotal);
        page.setStartindex((pageIndex-1)*pageCount);
        List<Storage> list = storageService.selectList(page);  //每页显示的信息
        page.setStorages(list);

        return page;
    }

    //form表带String类型转换date类型
    @InitBinder
    public void initBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat,true));
    }

    /**
     * 添加信息放发
     * @param storage
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping(value = "add")
    @ResponseBody
    public ModelAndView addStorage(Storage storage, HttpServletRequest request, ModelAndView mv){
        storageService.insertStorage(storage);
        Page page = getPage(1, 5);
        request.setAttribute("page",page);
        mv.setViewName("model");
        return mv;
    }

    /**
     * 查询名字是否重复
     * @param storage
     * @return
     */
    @RequestMapping(value = "name")
    @ResponseBody
    public Integer name(Storage storage){
        return storageService.selectName(storage);
    }

    /**
     * 分页显示
     * @param pageIndex
     * @param request
     * @param mv
     * @return
     */
    @RequestMapping(value = "show")
    @ResponseBody
    public ModelAndView show(Integer pageIndex, HttpServletRequest request, ModelAndView mv){
        Page page = getPage(pageIndex, 5);
        request.setAttribute("page",page);
        mv.setViewName("model");
        return mv;
    }

    /**
     * 查询即将插入的下一个id
     * @return
     */
    @RequestMapping("showid")
    @ResponseBody
    public Object showid(){
        int id = storageService.selectid();
        return id+1;
    }

    /**
     * 通过id查找这个商品的信息
     * @param storage
     * @return
     */
    @RequestMapping("id")
    @ResponseBody
    public Object id(Storage storage){
        Storage storage1 = storageService.selectByName(storage);
        return storage1;
    }

}
