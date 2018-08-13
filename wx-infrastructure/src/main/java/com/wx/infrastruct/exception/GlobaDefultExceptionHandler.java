package com.wx.infrastruct.exception;

import com.wx.infrastruct.response.Result;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/10
 * @time: 下午3:57
 * @description : 全局统一默认的异常处理
 */
public interface GlobaDefultExceptionHandler {



     /**
     * lijianguo
     * 2018/8/10 - 下午4:00
     * 全局异常处理
     */
    Result defultExcepitonHandler(HttpServletRequest request, Exception e);
}
