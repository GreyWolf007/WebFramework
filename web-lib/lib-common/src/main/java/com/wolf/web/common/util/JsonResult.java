package com.wolf.web.common.util;

import java.io.Serializable;

/**
 * @description:
 * @author: GreyWolf
 * @create: 2018/11/13 09:40
 **/
public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = -6262168745099326710L;

    public JsonResult(){
        this.result = 0;
    }

    public JsonResult(int result){
        this.result = result;
    }

    public JsonResult(int result, String msg){
        this.result = result;
        this.msg = msg;
    }

    public JsonResult(int result, String msg, T data){
        this.result = result;
        this.msg = msg;
        this.data = data;
    }
    public JsonResult(int result, String msg, T data,boolean haveRigt ){
        this.result = result;
        this.msg = msg;
        this.data = data;
        this.haveRigt = haveRigt;
    }

    private int result;
    private String msg;
    private T data;
    private boolean haveRigt;

    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public boolean isHaveRigt() {
        return haveRigt;
    }

    public void setHaveRigt(boolean haveRigt) {
        this.haveRigt = haveRigt;
    }

}