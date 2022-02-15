package com.mamata.fsd.domain.user;

import java.util.List;

import com.mamata.fsd.domain.DDD;

@DDD.Repository
public interface Users {

    User findOne(String userName);

    List<User> getAllUsers();
}
