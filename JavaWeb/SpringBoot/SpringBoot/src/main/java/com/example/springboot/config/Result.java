package com.example.springboot.config;

import lombok.Data;

@Data
public class Result<T> {
    /*返回处理消息*/
    private String message = "操作成功！";

    /*返回代码*/
    private Integer code = 0;

    /*返回数据对象 data*/
    private T data;
    public Result() {
    }

    public Result<T> success(String message) {
        this.message = message;
        this.code = 200;
        return this;
    }

    public static Result<Object> ok() {
        Result<Object> r = new Result<Object>();
        r.setCode(200);
        r.setMessage("成功");
        return r;
    }

    public static Result<Object> ok(String msg) {
        Result<Object> r = new Result<Object>();
        r.setCode(200);
        r.setMessage(msg);
        return r;
    }

    public static Result<Object> ok(Object data) {
        Result<Object> r = new Result<Object>();
        r.setCode(200);
        r.setData(data);
        return r;
    }

    public static Result<Object> error(String msg) {
        return error(500, msg);
    }

    public static Result<Object> error(int code, String msg) {
        Result<Object> r = new Result<Object>();
        r.setCode(code);
        r.setMessage(msg);
        return r;
    }

    public Result<T> error500(String message) {
        this.message = message;
        this.code = 500;
        return this;
    }
}
