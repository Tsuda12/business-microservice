package com.tsuda.user.repositories;

import com.tsuda.user.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;


public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
