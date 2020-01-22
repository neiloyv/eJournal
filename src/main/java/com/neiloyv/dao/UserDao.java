package com.neiloyv.dao;

import com.neiloyv.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername (String username);
}
