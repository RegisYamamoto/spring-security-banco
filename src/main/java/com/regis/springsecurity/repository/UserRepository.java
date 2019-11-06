package com.regis.springsecurity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.regis.springsecurity.model.User;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	User findByUsername(String username);
}