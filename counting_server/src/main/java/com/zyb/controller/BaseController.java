package com.zyb.controller;

import com.zyb.error.BusinessException;
import com.zyb.error.EmBusinessError;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class BaseController {

    public static final String CONTENT_TYPE_FORMED = "application/x-www-form-urlencoded";

    @ExceptionHandler({BusinessException.class})
    @ResponseBody
    public EmBusinessError handlerException(BusinessException e) {
        System.out.println(e.getErrMsg());
        e.printStackTrace();
        EmBusinessError emBusinessError = EmBusinessError.UNKNOWN_ERROR;
        emBusinessError.setErrMsg(e.getErrMsg());
        return emBusinessError;
    }

}
