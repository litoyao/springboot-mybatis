package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author lito.yao
 * @create 2019/10/11 17:17
 */
@Entity
@Table(name = "tb_order")
@Getter
@Setter
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "order_number")
    private String orderNumber;
    private Date created;
    private Date updated;

    private User user;
}
