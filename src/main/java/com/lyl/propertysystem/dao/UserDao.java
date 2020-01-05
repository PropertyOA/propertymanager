package com.lyl.propertysystem.dao;

import com.lyl.propertysystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    User selectOne(String userName,String pwd);
}
