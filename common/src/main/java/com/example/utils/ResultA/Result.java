package com.example.utils.ResultA;

/**
 *  封装的一个通用返回类
 *  来源https://www.cnblogs.com/CF1314/p/13686123.html
 * @param <T>
 */
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result() {
    }

    public Result(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    /**
     * 本类中set方法按照方法链改写
     * 详情见 Java 链式方法 https://www.cnblogs.com/lcngu/p/6539515.html
     * @param code
     * @return
     */
    public Result setCode(Integer code) {
        this.code = code;
        return this;
    }

//    public void setCode(Integer code) {
//        this.code = code;
//    }


    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Result setCode(ResultEnum resultEnum) {
        this.code = resultEnum.code;
        return this;
    }
}
