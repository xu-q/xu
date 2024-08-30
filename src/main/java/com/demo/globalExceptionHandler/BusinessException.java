package com.demo.globalExceptionHandler;

public class BusinessException extends RuntimeException {
    private int code;
    private String message;

    public BusinessException(int code, String message) {
        this.message = message;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
