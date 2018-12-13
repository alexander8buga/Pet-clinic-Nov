package springFramework.petClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springFramework.petClinic.services.OwnerService;

/**
 * Created by ab on 11/xx/18
 */
@Controller
@RequestMapping({"/owners"})
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"/index", "","/","/index.html"})
    public String listOwner(Model model){

        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";

    }
}
