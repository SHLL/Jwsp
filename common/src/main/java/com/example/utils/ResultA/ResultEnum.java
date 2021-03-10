package com.example.utils.ResultA;

/**
 * 枚举类 用来限制 code的范围 result过程的辅助类
 */
public enum ResultEnum {
    /**
     * 成功
     */
    SUCCESS(200),
    /**
     * 失败
     */
    FAIL(400),
    /**
     * 接口不存在
     */
    NOT_FOUND(404),
    /**
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(500);
    public int code;
    ResultEnum(int code) {
        this.code = code;
    }
}
