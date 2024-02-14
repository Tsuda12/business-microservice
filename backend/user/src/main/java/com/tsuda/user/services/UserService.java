package com.tsuda.user.services;

import com.tsuda.user.models.UserModel;
import com.tsuda.user.producers.UserProducer;
import com.tsuda.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserProducer userProducer;

    @Transactional
    public UserModel save(UserModel userModel){
        userModel =  userRepository.save(userModel);
        userProducer.publishMessageEmail(userModel);
        return userModel;
    }
}