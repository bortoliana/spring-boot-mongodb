package com.bortliana.springmongo.dto;

import com.bortliana.springmongo.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    private UserDTO(){

    }
    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }
}
