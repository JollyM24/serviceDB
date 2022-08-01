package com.example.servicedb.controller;

import com.example.servicedb.model.Clients;
import com.example.servicedb.model.Orders;
import com.example.servicedb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/goIndex2")
    public String goIndexTwo(Model model){return "index";}

    @RequestMapping("/Orders")
    public String viewOrders(Model model){
        List<Orders> orderList = orderService.findAll();
        model.addAttribute("orderList", orderList);
        return "Orders";
    }

    @RequestMapping("/edit_order/{id_order}")
    public ModelAndView showEditOrder(@PathVariable(name = "id_order") Integer id_order){
        ModelAndView mav = new ModelAndView("editOrder");
        Orders order = orderService.get(id_order);
        mav.addObject("order", order);
        return mav;
    }

    @RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
    public String saveOrder(@ModelAttribute("Orders") Orders order){
        orderService.saveOrder(order);
        return "redirect:/Orders";
    }

    @RequestMapping("/delete_order/{id_order}")
    public String deleteOrder(@PathVariable(name="id_order") Integer id_order){
        orderService.deleteById(id_order);
        return "redirect:/Orders";
    }

    @RequestMapping("/newOrder")
    public String newOrder(Model model){
        Orders order = new Orders();
        model.addAttribute("order", order);
        return "newOrder";
    }
}
