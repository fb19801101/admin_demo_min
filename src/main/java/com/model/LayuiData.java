package com.model;

import java.util.List;
import java.util.Objects;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-04-28 18:04
 */
public class LayuiData<T> {
    private int code;
    private String msg;
    private long count;
    private T data;

    public LayuiData() {
    }

    public LayuiData(int code, String msg, T data, long count) {
        this.msg = msg;
        this.data = data;
        this.code = code;
        this.count = count;
    }

    public LayuiData(int code, String msg, T data) {
        this.msg = msg;
        this.data = data;
        this.code = code;
    }

    public LayuiData(int code, T data, long count) {
        this.data = data;
        this.code = code;
        this.count = count;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public long getCount() {
        return count;
    }
    public void setCount(long count) {
        this.count = count;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LayuiData<?> layuiData = (LayuiData<?>) o;
        return code == layuiData.code &&
                count == layuiData.count &&
                Objects.equals(msg, layuiData.msg) &&
                Objects.equals(data, layuiData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, count, data);
    }

    @Override
    public String toString() {
        return "LayuiData{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
