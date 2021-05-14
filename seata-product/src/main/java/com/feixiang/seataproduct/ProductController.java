package com.feixiang.seataproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable("id") int id){
        System.out.println("id="+id);
        productService.updateProduct();
        return "abc";
    }
}
