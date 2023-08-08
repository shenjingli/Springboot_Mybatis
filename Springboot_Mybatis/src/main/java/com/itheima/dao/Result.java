package com.itheima.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

@ApiModel(value = "公共返回集")
public class Result <T>{

    @ApiModelProperty(value = "是否成功",example = "ture")
    private boolean success;

    @ApiModelProperty(value = "状态码",example = "200")
    private int code;

    @ApiModelProperty(value = "返回集",example = "200")
    private Map<String,T> data;

    @ApiModelProperty(value = "数量",example = "0")
    private int count;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Map<String, T> getData() {
        return data;
    }

    public void setData(Map<String, T> data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
