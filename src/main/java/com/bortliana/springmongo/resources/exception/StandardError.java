package com.bortliana.springmongo.resources.exception;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class StandardError implements Serializable {

    private Long timestamp;
    private Integer status;
    private String error;
    private String path;

    public StandardError(){
    }

    public StandardError(Long timestamp, Integer status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }
}