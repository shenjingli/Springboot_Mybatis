package com.itheima.mapper;

import com.itheima.dao.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getUserById(@Param("id") String id);
}
