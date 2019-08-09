package com.iotechn.unimall.data.enums;

/**
 * Created by rize on 2019/2/13.
 */
public enum UserLoginType {
    REGISTER(0, "手机注册"),
    MP_WEIXIN(1, "WX小程序登录"),
    APP_WEIXIN(2, "WX第三方登录"),
    ;

    UserLoginType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}