package com.feixiang.seataorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/modifyAccount/{id}")
    public String addOrder(@PathVariable("id")int id) {
        return orderService.modifyAccount(id);
    }


}
