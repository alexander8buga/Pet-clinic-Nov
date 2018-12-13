package springFramework.petClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ab on 11/xx/18
 */
@Controller
@RequestMapping({"/owners"})
public class OwnerController {

    @RequestMapping({"/index", "","/","/index.html"})
    public String listOwner(){
        return "owners/index";

    }
}
