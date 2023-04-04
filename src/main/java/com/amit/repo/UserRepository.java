package com.amit.repo;

import org.springframework.data.repository.CrudRepository;

import com.amit.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
