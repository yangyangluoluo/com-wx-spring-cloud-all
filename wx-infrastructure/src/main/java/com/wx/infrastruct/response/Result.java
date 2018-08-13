package com.wx.infrastruct.response;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lijianguo
 * @date: 2018/8/10
 * @time: 下午3:41
 * @description : 系统统一返回数据的格式
 */
public class Result{

    private Integer code;

    private String msg;

    private Object data;

    public Result() {}

    public Result(ResultCode code){
        this.code = code.code();
        this.msg = code.message();
    }

    public void setResultCode(ResultCode code) {
        this.code = code.code();
        this.msg = code.message();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    //
    //    }
    //        return result;
    //        result.setDataIn(data);
    //        result.setResultCode(resultCode);
    //        Result result = new Result();
    //    public static Result failure(ResultCode resultCode, Object data) {
    //
    //    }
    //        return result;
    //        result.setResultCode(resultCode);
    //        Result result = new Result();
    //    public static Result failure(ResultCode resultCode) {
    //
    //    }
    //        return result;
    //        result.setDataIn(data);
    //        result.setResultCode(ResultCode.SUCCESS);
    //        Result result = new Result();
    //    public static Result success(Object data) {
    //
    //    }
    //        this.dataIn = dataIn;
    //    public void setDataIn(Object dataIn) {
    //
    //    }
    //        return dataIn;
    //    public Object getDataIn() {
    //
    //    }
    //        return result;
    //        result.setResultCode(ResultCode.SUCCESS);
    //        Result result = new Result();
    //    public static Result success() {
    //
    //    }
    //        this.msg = msg;
    //        this.code = code;
    //    public Result(Integer code, String msg) {

}
