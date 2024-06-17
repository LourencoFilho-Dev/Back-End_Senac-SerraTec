package com.example.ProjectManagement.repository;

import com.example.projectmanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
