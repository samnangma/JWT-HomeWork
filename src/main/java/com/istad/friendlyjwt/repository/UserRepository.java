package com.istad.friendlyjwt.repository;

import com.istad.friendlyjwt.model.UserAcc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRepository {

    @Select("select * from accounttb where username like #{username}")
    UserAcc getAllUsers(String username);
}
