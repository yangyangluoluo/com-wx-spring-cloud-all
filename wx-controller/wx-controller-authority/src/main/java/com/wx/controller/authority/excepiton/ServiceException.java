package com.wx.controller.authority.excepiton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/10
 * @time: 下午2:55
 * @description : com-wx-spring-cloud-all描述
 */
public class ServiceException extends RuntimeException {

    //自定义错误码
    private Integer code;

    //自定义构造器，只保留一个，让其必须输入错误码及内容

    public ServiceException(int code,String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
