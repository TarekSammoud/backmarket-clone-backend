package com.backmarket_clone.backmarketClone.services.interfaces.user;


import com.backmarket_clone.backmarketClone.entities.user.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
    User getUserById(Long id);
}