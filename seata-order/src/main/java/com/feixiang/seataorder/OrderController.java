package com.feixiang.seataorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductClient client;

    @RequestMapping("/addOrder")
    public String addOrder() {
        orderDao.addOrder("123");
        client.updateProduct(1);
        return "123";
    }


}
