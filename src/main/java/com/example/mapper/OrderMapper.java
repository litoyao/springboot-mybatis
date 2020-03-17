package com.example.mapper;

import com.example.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lito.yao
 * @create 2019/10/11 17:30
 */
@Repository
public interface OrderMapper {

    /**
     * 根据订单号查询订单用户的信息
     *
     * @param number
     * @return
     */
    Order queryOrderWithUserByOrderNumber(@Param("number") String number);

    List<Order> selectAll();

}
