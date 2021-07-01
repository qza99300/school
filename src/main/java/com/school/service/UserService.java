package com.school.service;

import com.school.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserService extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {

    public User getById(int id);
}
