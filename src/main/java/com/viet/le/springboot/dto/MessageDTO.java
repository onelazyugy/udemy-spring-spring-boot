package com.viet.le.springboot.dto;

/**
 * Created by VTL on 2/22/18.
 */
public class MessageDTO {
    private String message;
    private String type;

    public MessageDTO() {
    }

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
}
