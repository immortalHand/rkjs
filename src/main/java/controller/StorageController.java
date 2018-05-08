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

    @RequestMapping(value = "add")
    @ResponseBody
    public ModelAndView addStorage(Storage storage, HttpServletRequest request, ModelAndView mv){
        storageService.insertStorage(storage);
        Page page = getPage(1, 5);
        request.setAttribute("page",page);
        mv.setViewName("model");
        return mv;
    }

    @RequestMapping(value = "name")
    @ResponseBody
    public Integer name(Storage storage){
        return storageService.selectName(storage);
    }

    @RequestMapping(value = "show")
    @ResponseBody
    public ModelAndView show(Integer pageIndex, HttpServletRequest request, ModelAndView mv){
        Page page = getPage(pageIndex, 5);
        request.setAttribute("page",page);
        mv.setViewName("model");
        return mv;
    }

    @RequestMapping("showid")
    @ResponseBody
    public Object showid(){
        int id = storageService.selectid();
        return id+1;
    }

    @RequestMapping("id")
    @ResponseBody
    public Object id(Storage storage){
        Storage storage1 = storageService.selectByName(storage);
        return storage1;
    }

}
