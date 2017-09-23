package com.scolarite.web;

import com.scolarite.beans.Adulte;
import com.scolarite.beans.Eleve;
import com.scolarite.beans.Inscription;
import com.scolarite.dao.AdulteRepository;
import com.scolarite.dao.InscriptionRepository;
import com.scolarite.services.AdulteService;
import com.scolarite.services.EleveService;
import com.scolarite.services.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by brahim on 04/10/16.
 */
@Controller
public class InscriptionController {

    @Autowired
    InscriptionService inscriptionService;
    @Autowired
    EleveService eleveService;
    @Autowired
    AdulteService adulteService;



    @GetMapping("/inscription")
    public String inscription(Model model){
        model.addAttribute("inscription", new Inscription());
        return "inscription";
    }

    @PostMapping("/inscription")
    public String inscriptionSubmit(@ModelAttribute Inscription inscription){

        System.out.println("Controlleur de submit ");
        if(eleveService.exist(inscription.getEleve().getCne()))
            System.out.print("l'eleve existe deja !!!! ");


        inscriptionService.addInscription(inscription);




        return "result_inscription";
    }
}
