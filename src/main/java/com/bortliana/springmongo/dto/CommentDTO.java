package com.bortliana.springmongo.dto;

import lombok.Getter;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class CommentDTO implements Serializable {

    private String text;
    private Data date;
    private AuthorDTO author;

    public CommentDTO(String text, Date parse, AuthorDTO author){}

    public CommentDTO(String text, Data date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }
}
