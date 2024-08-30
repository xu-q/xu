package com.demo.globalExceptionHandler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({BusinessException.class})
    public String exception(BusinessException e) {
        //log.info("exception", e);
        return "message:" + e.getMessage() + "code:" + e.getCode();
    }

    @ExceptionHandler({SystenException.class})
    public String exception(SystenException e) {
        log.info("exception", e);
        return "message:" + e.getMessage() + "code:" + e.getCode();
    }

    @ExceptionHandler({Exception.class})
    public String exception(Exception e) {
        log.info("exception", e);
        return "Exception";
    }

    @ExceptionHandler({RuntimeException.class})
    public String exception(RuntimeException e) {
        log.info("exception", e);
        return "RuntimeException";
    }
}
