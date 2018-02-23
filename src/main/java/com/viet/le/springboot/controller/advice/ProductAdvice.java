package com.viet.le.springboot.controller.advice;

import com.viet.le.springboot.dto.MessageDTO;
import com.viet.le.springboot.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by VTL on 2/22/18.
 */
@RestControllerAdvice
public class ProductAdvice {

    /**
     * Will handle NullPointerException from any controller and return a MessageDTO
     * @param exception
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MessageDTO processNullPointerException(NullPointerException exception) {
        MessageDTO message = new MessageDTO();
        message.setMessage("Errors found in request, try again later: " + exception.getMessage());
        message.setType("ERROR");
        return message;
    }

    /**
     * Will handle CustomException from any controller and return a MessageDTO
     * @param exception
     * @return
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MessageDTO processCustomException(CustomException exception) {
        MessageDTO message = new MessageDTO();
        message.setMessage("Custom Exception errors found in request, try again later: " + exception.getMessage());
        message.setType("ERROR");
        return message;
    }
}
