package com.feixiang.seataorder;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDao {

    @Insert("insert into seata_order.order(id,orderNo) values(1,#{orderNo})")
    public void addOrder(@Param("orderNo") String orderNo);

}
