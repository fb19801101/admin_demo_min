package com.exceltest.entity;

import com.exceltest.converter.ExcelDateWriteConverter;
import com.exceltest.options.TypeOptions;

import java.util.Objects;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-08-28 11:04
 */
public class DynamicItem implements Comparable<DynamicItem> {
    private Integer type;
    private String typeOption;
    private String value;
    private Double time;
    private String timeString;
    private String timeHmsString;
    private Integer flag;

    public String typeConvert(Integer type) {
        return new TypeOptions().type(type);
    }

    public Integer typeConvert(String typeOption) {
        return new TypeOptions().index(typeOption);
    }

    public String timeConvert(Double time) {
        return new ExcelDateWriteConverter().strDate(time);
    }

    public String timeConvert(Double time, String format) {
        return new ExcelDateWriteConverter().strDate(time, format);
    }

    public Double timeConvert(String timeString) {
        return new ExcelDateWriteConverter().dblDate(timeString);
    }

    public DynamicItem() {
        this.flag = 0;
    }

    public DynamicItem(Integer type, String value, Double time) {
        this.type = type;
        this.typeOption = typeConvert(this.type);
        this.value = value;
        this.time = time;
        this.timeString = timeConvert(this.time);
        this.timeHmsString = timeConvert(time, "HH:mm:ss");
        this.flag = 0;
    }

    public DynamicItem(String typeOption, String value, String timeString) {
        this.type = typeConvert(typeOption);
        this.typeOption = typeOption;
        this.value = value;
        this.time = timeConvert(timeString);
        this.timeString = timeString;
        this.timeHmsString = timeConvert(time, "HH:mm:ss");
        this.flag = 0;
    }

    public DynamicItem(Integer type, String typeOption, String value, Double time, String timeString, String timeHmsString) {
        this.type = type;
        this.typeOption = typeOption;
        this.value = value;
        this.time = time;
        this.timeString = timeString;
        this.timeHmsString = timeHmsString;
        this.flag = 0;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
        this.typeOption = typeConvert(this.type);
    }

    public String getTypeOption() {
        return typeOption;
    }

    public void setTypeOption(String typeOption) {
        this.typeOption = typeOption;
        this.type = typeConvert(this.typeOption);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
        this.timeString = timeConvert(this.time);
        this.timeHmsString = timeConvert(time, "HH:mm:ss");
    }

    public String getTimeString() {
        return timeString;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
        this.time = timeConvert(this.timeString);
        this.timeHmsString = timeConvert(time, "HH:mm:ss");
    }

    public String getTimeHmsString() {
        return timeHmsString;
    }

    public void setTimeHmsString(String timeHmsString) {
        this.timeHmsString = timeHmsString;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DynamicItem that = (DynamicItem) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(typeOption, that.typeOption) &&
                Objects.equals(value, that.value) &&
                Objects.equals(time, that.time) &&
                Objects.equals(timeString, that.timeString) &&
                Objects.equals(timeHmsString, that.timeHmsString) &&
                Objects.equals(flag, that.flag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, typeOption, value, time, timeString, timeHmsString, flag);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DynamicItem{");
        sb.append("type=").append(type);
        sb.append(", typeOption='").append(typeOption).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append(", time=").append(time);
        sb.append(", timeString='").append(timeString).append('\'');
        sb.append(", timeHmsString='").append(timeString).append('\'');
        sb.append(", flag=").append(flag);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(DynamicItem o) {
        return time.compareTo(o.getTime());
    }
}
