package com.neiloyv.service;

import com.neiloyv.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
