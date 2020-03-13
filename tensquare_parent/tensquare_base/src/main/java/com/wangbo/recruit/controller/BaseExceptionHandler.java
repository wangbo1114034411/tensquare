package com.wangbo.recruit.controller;

import com.wangbo.entity.Result;
import com.wangbo.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangbo
 * @date 2020-03-11 16:50
 */
@ControllerAdvice
public class BaseExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR.getCode(), e.getMessage());
    }
}
