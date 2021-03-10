package com.example.utils.ResusltB;

/**
 * 返回工具类
 * 封装用于controller中的接口方法
 * 自修改result同意返回类的改造，待后续优化，此方式不确定是否足够完善。
 */
public class ResultUtilsTest {
    //返回第一层数据内容
    /*
    * "meta":{}，
    * "data":{}
    * */
    public static <T> ResultTest<T> define(T data,T meta) {
        ResultTest result = new ResultTest<T>();
        return result.setData(data).setMeta(meta);
    }
    /*
    * 返回Meta的数据内容
    * "status":{},
    * "msg":{}
    * */
    public static Meta setMeta(int status,String msg){
        Meta meta = new Meta();
        return meta.setStatus(status).setMsg(msg);
    }
}
