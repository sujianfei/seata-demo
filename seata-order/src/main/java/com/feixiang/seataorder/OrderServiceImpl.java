package com.feixiang.seataorder;

import com.feixiang.seataorder.mapper.OrderDao;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductClient client;

    @Override
    @GlobalTransactional
    public String addOrder() {
        orderDao.addOrder("123");
        client.updateProduct(1);
        int i=1/0;
        return "123";
    }
}
