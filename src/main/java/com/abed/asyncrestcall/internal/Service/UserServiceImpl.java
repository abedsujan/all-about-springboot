package com.abed.asyncrestcall.internal.Service;

import com.abed.asyncrestcall.internal.model.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements UserService {


    public UserDTO getUserDetails(){
       return UserDTO.builder()
               .name("Abed Sujan")
               .id("G500")
               .type("admin")
               .build();
    }
}
