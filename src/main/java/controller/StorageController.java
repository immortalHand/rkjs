package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StorageService;

@Controller
public class StorageController {

    @Autowired
    private StorageService storageService;

    @RequestMapping("/")
    public String index(){
        System.out.println("asd");
        return "index";
    }
}
