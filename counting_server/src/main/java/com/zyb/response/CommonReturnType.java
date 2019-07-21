package com.zyb.response;

import com.alibaba.fastjson.JSONObject;

public class CommonReturnType {

    private int code;
    private Object data;

    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,20000);
    }

    public static CommonReturnType create(Object result, int code){
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setCode(code);
        return type;
    }

    public int getCode() {return code;}

    public void setCode(int code) {this.code = code;}

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toJson(){
        return JSONObject.toJSONString(this);
    }
}
