package com.wx.controller.authority.excepiton;

import com.netflix.hystrix.exception.HystrixRuntimeException;
import com.wx.domain.user.User;
import com.wx.infrastruct.exception.GlobaDefultExceptionHandler;
import com.wx.infrastruct.response.Result;
import com.wx.infrastruct.response.ResultCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/10
 * @time: 下午4:01
 * @description : 异常处理
 */
@ControllerAdvice
public class GlobaDefultExceptionHandlerImpl implements GlobaDefultExceptionHandler {

    @Override
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Result defultExcepitonHandler(HttpServletRequest request, Exception e) {

        e.printStackTrace();

        // 服务熔断的异常
        if (e instanceof HystrixRuntimeException){
            Result result = new Result();
            result.setResultCode(ResultCode.INTERFACE_INNER_INVOKE_ERROR);
            return result;
        }else{
            // 未知异常
            return new Result(ResultCode.SPECIFIED_QUESTIONED_USER_NOT_EXIST);
        }
    }

}
