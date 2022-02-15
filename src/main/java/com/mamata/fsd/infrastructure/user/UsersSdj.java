package com.mamata.fsd.infrastructure.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mamata.fsd.domain.user.User;

@Repository
public interface UsersSdj extends JpaRepository<User, String> {
}
