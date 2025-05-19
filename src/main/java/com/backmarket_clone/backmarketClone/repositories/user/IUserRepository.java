package com.backmarket_clone.backmarketClone.repositories.user;

import com.backmarket_clone.backmarketClone.entities.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository  extends JpaRepository<User, Long> {
    User findByUsername(String username);
}