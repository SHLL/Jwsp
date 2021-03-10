package com.example.utils.ResusltB;

/**
 * 定义result返回的数据格式（数据体）:
 * {
 *     "meta":{},
 *     "data":{}
 * }
 * @param <T>
 */

/**
 * 本类中setter方法按照方法链改写
 * 详情见 Java 链式方法 https://www.cnblogs.com/lcngu/p/6539515.html
 * @return
 */
public class ResultTest<T> {
    private T meta;
    private T data;

    public ResultTest() {
    }

    public ResultTest(T meta, T data) {
        this.meta = meta;
        this.data = data;
    }

    public T getMeta() {
        return meta;
    }

    public ResultTest setMeta(T meta) {
        this.meta = meta;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResultTest setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "ResultTest{" +
                "meta=" + meta +
                ", data=" + data +
                '}';
    }
}
