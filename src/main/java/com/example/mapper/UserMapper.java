package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Repository;

/**
 * @author lito.yao
 * @create 2019/10/11 14:20
 */
@Repository
public interface UserMapper {


    User selectById(int id);

    int deleteUser(int id);

    int save(User user);
}
