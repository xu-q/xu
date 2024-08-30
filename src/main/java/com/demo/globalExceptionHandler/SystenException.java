package com.demo.globalExceptionHandler;

public class SystenException extends RuntimeException {
    private int code;
    private String message;

    public SystenException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return super.getMessage();
    }
}
