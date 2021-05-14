package com.feixiang.seataproduct;

import com.feixiang.seataproduct.mapper.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    @Transactional
    public void updateProduct(){
        System.out.println("call updateProduct");
        productDao.updateProduct();
    }
}
