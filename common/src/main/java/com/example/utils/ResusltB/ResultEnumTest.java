package com.example.utils.ResusltB;

public enum ResultEnumTest {
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
    ResultEnumTest(int code) {
        this.code = code;
    }
}
