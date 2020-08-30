package com.dtree;


import javax.transaction.Status;
import java.util.Objects;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-04-20 15:28
 */
public class DTreeData {
    /**
     * 状态码
     */
    private int code;
    /**
     * 信息标识
     */
    private String msg;
    /**
     * 状态类
     */
    private Status status;
    /**
     * 数据
     */
    private Object data;

    /**
     * 默认构造方法
     */
    public DTreeData() {
    }

    /**
     * 完整构造方法
     */
    public DTreeData(int code, String msg, Status status, Object data) {
        this.code = code;
        this.msg = msg;
        this.status = status;
        this.data = data;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
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
        DTreeData that = (DTreeData) o;
        return code == that.code &&
                msg.equals(that.msg) &&
                status.equals(that.status) &&
                data.equals(that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, msg, status, data);
    }

    @Override
    public String toString() {
        return "DTreeResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", status=" + status +
                ", data=" + data +
                '}';
    }
}
