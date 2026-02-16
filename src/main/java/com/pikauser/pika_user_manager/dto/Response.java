package com.pikauser.pika_user_manager.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Response {
    private String Message;
    private Object data;
    private HttpStatus status;

    public Response(Object data, String message, HttpStatus httpStatus) {
        this.data = data;
        this.Message = message;
        this.status = httpStatus;
    }
}
