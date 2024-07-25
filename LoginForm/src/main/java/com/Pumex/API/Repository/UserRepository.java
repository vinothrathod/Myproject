package com.Pumex.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Pumex.API.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
