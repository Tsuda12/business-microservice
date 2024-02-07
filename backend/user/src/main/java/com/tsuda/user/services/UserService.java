package com.tsuda.user.services;

import com.tsuda.user.models.UserModel;
import com.tsuda.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public UserModel save(UserModel userModel){
        return userRepository.save(userModel);
    }
}
