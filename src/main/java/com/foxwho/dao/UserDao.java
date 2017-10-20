package com.foxwho.dao;

import com.foxwho.pojo.User;
import com.foxwho.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserDao extends Mapper<User> {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}