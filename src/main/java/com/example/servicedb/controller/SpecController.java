package com.example.servicedb.controller;

import com.example.servicedb.model.Computers;
import com.example.servicedb.model.Specialists;
import com.example.servicedb.service.CompService;
import com.example.servicedb.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SpecController {
    @Autowired
    SpecService specService;

    @RequestMapping("/goIndex5")
    public String goIndexFive(Model model){
        return "index";
    }

    @RequestMapping("/Specialists")
    public String viewSpecialists(Model model,
                                  @Param("keyword") String keyword){
        List<Specialists> specList = specService.findAll(keyword);
        model.addAttribute("specList", specList);
        model.addAttribute("keyword", keyword);
        return "Specialists";
    }

//    @RequestMapping("/edit_computer/{id_computer}")
//    public ModelAndView showEditComp(@PathVariable(name = "id_computer") Integer id_computer){
//        ModelAndView mav = new ModelAndView("editComputer");
//        Computers computer = compService.get(id_computer);
//        mav.addObject("computer", computer);
//        return mav;
//    }
//
//    @RequestMapping(value = "/saveComputer", method = RequestMethod.POST)
//    public String saveComputer(@ModelAttribute("Computers") Computers computer){
//        compService.saveComputer(computer);
//        return "redirect:/Computers";
//    }
//
//    @RequestMapping("/newComputer")
//    public String newComputer(Model model){
//        Computers computer = new Computers();
//        model.addAttribute("computer",computer);
//        return "newComputer";
//    }
}
