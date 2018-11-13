package com.wolf.web.common.exception;

/**
 * @description:
 * @author: GreyWolf
 * @create: 2018/11/13 11:09
 **/
public class CommonException extends Exception {
    public CommonException(String msg) {
        super(msg);
    }

    public CommonException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }
}
