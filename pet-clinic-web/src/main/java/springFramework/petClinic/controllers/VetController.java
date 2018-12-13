package springFramework.petClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ab on 11/xx/18
 */
@Controller
public class VetController {
    @RequestMapping({"/vets/index", "/vets","/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
