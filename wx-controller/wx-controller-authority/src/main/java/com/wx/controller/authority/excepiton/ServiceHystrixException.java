package com.wx.controller.authority.excepiton;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/10
 * @time: 下午2:59
 * @description : com-wx-spring-cloud-all描述
 */
public class ServiceHystrixException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private Integer code;  //错误码

    private String message;

    public ServiceHystrixException() {}

    public  ServiceHystrixException(String message){
        this.message = message;

    }

    public ServiceHystrixException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
