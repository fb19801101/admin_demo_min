package com.dtree;

import java.util.Objects;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-04-20 15:33
 */
public class CheckArr {
    /**
     * 复选框标记
     */
    private String type;
    /**
     * 复选框是否选中
     */
    private String checked;

    /**
     * 默认构造方法
     */
    public CheckArr() {
    }

    /**
     * 完整构造方法
     */
    public CheckArr(String type, String checked) {
        this.type = type;
        this.checked = checked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChecked() {
        return checked;
    }

    public void setChecked(String checked) {
        this.checked = checked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckArr checkArr = (CheckArr) o;
        return type.equals(checkArr.type) &&
                checked.equals(checkArr.checked);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, checked);
    }

    @Override
    public String toString() {
        return "CheckArr{" +
                "type='" + type + '\'' +
                ", checked='" + checked + '\'' +
                '}';
    }
}
