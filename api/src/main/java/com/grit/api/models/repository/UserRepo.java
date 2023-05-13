package com.grit.api.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.grit.api.models.entities.User;

public interface UserRepo extends CrudRepository<User, Long> {

}
