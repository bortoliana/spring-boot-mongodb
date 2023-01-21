package com.bortliana.springmongo.dto;

import com.bortliana.springmongo.domain.User;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO(){
    }

    public AuthorDTO(User obj){
        id = obj.getId();
        name = obj.getName();
    }
}

