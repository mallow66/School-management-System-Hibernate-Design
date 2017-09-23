package com.scolarite.web;

import com.scolarite.beans.Adulte;
import com.scolarite.beans.Eleve;
import com.scolarite.dao.EleveDao;
import com.scolarite.services.AdulteService;
import com.scolarite.services.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.Element;

import java.util.List;

/**
 * Created by brahim on 01/10/16.
 */
@Controller
public class TestController {
    @Autowired private EleveService eleveService;
    @Autowired private AdulteService adulteService;

@GetMapping("/test")
public String test(Model model){
    List<Adulte> l = adulteService.getAdultes();
    System.out.println(l.get(0).getNom());
    model.addAttribute("adultes", l);




        return "test";
    }

    @PostMapping("/test")
    public String test2(@ModelAttribute Eleve eleve){


        return "test_result";
    }
}
