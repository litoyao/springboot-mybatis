package com.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author lito.yao
 * @create 2019/10/11 14:17
 */
@Entity
@Table(name="tb_user")
@Getter
@Setter
public class User  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Integer age;
    private String sex;
    private String birthday;
    private Date created;
    private Date updated;

}
