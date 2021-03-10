package com.example.utils.ResusltB;

/**
 * 定义meta数据的内容(数据体)
 * meta{
 *     int status,
 *     String msg
 * }
 * "meta":{
 *     "status": int(),
 *     "msg" : String()
 * }
 */
public class Meta {
    private int status;
    private String msg;

    public Meta() {
    }

    public Meta(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public Meta setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Meta setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "Meta{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                '}';
    }
}
