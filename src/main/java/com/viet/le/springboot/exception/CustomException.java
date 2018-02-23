package com.viet.le.springboot.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by VTL on 2/22/18.
 */
public class CustomException extends Exception{
    private String message;
    private String type;

    public CustomException(String message, String type) {
        super(message);
        this.message = message;
        this.type = type;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CustomException{" +
                "message='" + message + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
