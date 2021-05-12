package com.feixiang.seataproduct;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductDao {

    @Insert("update seata_product.product set count=count-1 where id=1")
    public void updateProduct();

}