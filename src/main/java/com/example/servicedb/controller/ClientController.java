package com.example.servicedb.controller;

import com.example.servicedb.model.Clients;
import com.example.servicedb.model.Specialists;
import com.example.servicedb.service.ClientService;
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
public class ClientController {
    @Autowired
    private ClientService clientService;

    @RequestMapping("/goIndex")
    public String goIndex(Model model){return "index";}

    @RequestMapping("/Clients")
    public String viewClients(Model model,
                               @Param("keyword") String keyword){
        List<Clients> clientList = clientService.findAll(keyword);
        model.addAttribute("clientList", clientList);
        return "Clients";
    }

    @RequestMapping("/edit_client/{id_client}")
    public ModelAndView showEditClient(@PathVariable(name = "id_client") Integer id_client){
        ModelAndView mav = new ModelAndView("editClient");
        Clients client = clientService.get(id_client);
        mav.addObject("client", client);
        return mav;
    }

    @RequestMapping(value = "/saveClient", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("Clients") Clients client){
        clientService.saveClient(client);
        return "redirect:/Clients";
    }

    @RequestMapping("/newClient")
    public String newClient(Model model){
        Clients client = new Clients();
        model.addAttribute("client", client);
        return "newClient";
    }
}
