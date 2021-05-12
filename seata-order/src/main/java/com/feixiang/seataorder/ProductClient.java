package com.feixiang.seataorder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("seata-product")
public interface ProductClient {

    @GetMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable("id") int id);

}
