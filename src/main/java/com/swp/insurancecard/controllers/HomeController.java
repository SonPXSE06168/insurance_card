package com.swp.insurancecard.controllers;

import com.swp.insurancecard.models.Insurance;
import com.swp.insurancecard.repositories.InsuranceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/home")
public class HomeController {
    @Autowired
    InsuranceRepository insuranceRepository;

    @GetMapping("")
    public String viewHomePage(Model model){
        List<Insurance> insuranceList = insuranceRepository.findAll();
        model.addAttribute("insuranceList", insuranceList);
        return "index";
    }
}
