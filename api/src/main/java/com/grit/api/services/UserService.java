package com.grit.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grit.api.models.entities.User;
import com.grit.api.models.repository.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User create(User user) {
        return userRepo.save(user);
    }

    public User findOne(Long id) {
        Optional<User> user = userRepo.findById(id);
        if (!user.isPresent()) {
            return null;
        }
        return user.get();
    }

    public Iterable<User> findAll() {
        return userRepo.findAll();
    }

    public void delete(Long id) {
        userRepo.deleteById(id);
    }
}
