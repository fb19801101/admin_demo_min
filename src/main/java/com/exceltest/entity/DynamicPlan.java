package com.exceltest.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dateutil.RegexUtil;
import com.exceltest.converter.*;
import com.exceltest.options.TypeOptions;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;

import java.io.Serializable;
import java.util.*;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-07-22 17:38
 */
public class DynamicPlan implements Serializable {
    private Integer id;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String unit;
    private Double value;
    private Integer type1;
    private String typeOption1;
    private String value1;
    private Double time1;
    private String timeString1;
    private Integer type2;
    private String typeOption2;
    private String value2;
    private Double time2;
    private String timeString2;
    private Integer type3;
    private String typeOption3;
    private String value3;
    private Double time3;
    private String timeString3;
    private Integer type4;
    private String typeOption4;
    private String value4;
    private Double time4;
    private String timeString4;
    private Integer type5;
    private String typeOption5;
    private String value5;
    private Double time5;
    private String timeString5;
    private Integer type6;
    private String typeOption6;
    private String value6;
    private Double time6;
    private String timeString6;
    private Integer type7;
    private String typeOption7;
    private String value7;
    private Double time7;
    private String timeString7;
    private Integer type8;
    private String typeOption8;
    private String value8;
    private Double time8;
    private String timeString8;
    private String charge1;
    private String charge2;
    private String charge3;
    private String charge4;
    private String info;

    private List<DynamicItem> items;

    private static final long serialVersionUID = 1L;

    public String typeConvert(Integer type) {
        return new TypeOptions().type(type);
    }

    public Integer typeConvert(String typeOption) {
        return new TypeOptions().index(typeOption);
    }

    public String timeConvert(Double time) {
        return new ExcelDateWriteConverter().strDate(time);
    }

    public Double timeConvert(String timeString) {
        return new ExcelDateWriteConverter().dblDate(timeString);
    }

    public DynamicPlan() {
        if(items != null) {
            items.clear();
        } else {
            items = new ArrayList<>();
        }
    }

    public DynamicPlan(Integer id, String name1, String name2, String name3, String name4, String unit, Double value, Integer type1, String value1, Double time1, Integer type2, String value2, Double time2, Integer type3, String value3, Double time3, Integer type4, String value4, Double time4, Integer type5, String value5, Double time5, Integer type6, String value6, Double time6, Integer type7, String value7, Double time7, Integer type8, String value8, Double time8, String charge1, String charge2, String charge3, String charge4, String info) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.unit = unit;
        this.value = value;
        this.type1 = type1;
        this.typeOption1 = typeConvert(this.type1);
        this.value1 = value1;
        this.time1 = time1;
        this.timeString1 = timeConvert(this.time1);
        this.type2 = type2;
        this.typeOption2 = typeConvert(this.type2);
        this.value2 = value2;
        this.time2 = time2;
        this.timeString2 = timeConvert(this.time2);
        this.type3 = type3;
        this.typeOption3 = typeConvert(this.type3);
        this.value3 = value3;
        this.time3 = time3;
        this.timeString3 = timeConvert(this.time3);
        this.type4 = type4;
        this.typeOption4 = typeConvert(this.type4);
        this.value4 = value4;
        this.time4 = time4;
        this.timeString4 = timeConvert(this.time4);
        this.type5 = type5;
        this.typeOption5 = typeConvert(this.type5);
        this.value5 = value5;
        this.time5 = time5;
        this.timeString5 = timeConvert(this.time5);
        this.type6 = type6;
        this.typeOption6 = typeConvert(this.type6);
        this.value6 = value6;
        this.time6 = time6;
        this.timeString6 = timeConvert(this.time6);
        this.type7 = type7;
        this.typeOption7 = typeConvert(this.type7);
        this.value7 = value7;
        this.time7 = time7;
        this.timeString7 = timeConvert(this.time7);
        this.type8 = type8;
        this.typeOption8 = typeConvert(this.type8);
        this.value8 = value8;
        this.time8 = time8;
        this.timeString8 = timeConvert(this.time8);
        this.charge1 = charge1;
        this.charge2 = charge2;
        this.charge3 = charge3;
        this.charge4 = charge4;
        this.info = info;

        initItems();
    }

    public DynamicPlan(Integer id, String name1, String name2, String name3, String name4, String unit, Double value, String typeOption1, String value1, String timeString1, String typeOption2, String value2, String timeString2, String typeOption3, String value3, String timeString3, String typeOption4, String value4, String timeString4, String typeOption5, String value5, String timeString5, String typeOption6, String value6, String timeString6, String typeOption7, String value7, String timeString7, String typeOption8, String value8, String timeString8, String charge1, String charge2, String charge3, String charge4, String info) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.unit = unit;
        this.value = value;
        this.type1 = typeConvert(typeOption1);
        this.typeOption1 = typeOption1;
        this.value1 = value1;
        this.time1 = timeConvert(timeString1);
        this.timeString1 = timeString1;
        this.type2 = typeConvert(typeOption2);
        this.typeOption2 = typeOption2;
        this.value2 = value2;
        this.time2 = timeConvert(timeString2);
        this.timeString2 = timeString2;
        this.type3 = typeConvert(typeOption3);
        this.typeOption3 = typeOption3;
        this.value3 = value3;
        this.time3 = timeConvert(timeString3);
        this.timeString3 = timeString3;
        this.type4 = typeConvert(typeOption4);
        this.typeOption4 = typeOption4;
        this.value4 = value4;
        this.time4 = timeConvert(timeString4);
        this.timeString4 = timeString4;
        this.type5 = typeConvert(typeOption5);
        this.typeOption5 = typeOption5;
        this.value5 = value5;
        this.time5 = timeConvert(timeString5);
        this.timeString5 = timeString5;
        this.type6 = typeConvert(typeOption6);
        this.typeOption6 = typeOption6;
        this.value6 = value6;
        this.time6 = timeConvert(timeString6);
        this.timeString6 = timeString6;
        this.type7 = typeConvert(typeOption7);
        this.typeOption7 = typeOption7;
        this.value7 = value7;
        this.time7 = timeConvert(timeString7);
        this.timeString7 = timeString7;
        this.type8 = typeConvert(typeOption8);
        this.typeOption8 = typeOption8;
        this.value8 = value8;
        this.time8 = timeConvert(timeString8);
        this.timeString8 = timeString8;
        this.charge1 = charge1;
        this.charge2 = charge2;
        this.charge3 = charge3;
        this.charge4 = charge4;
        this.info = info;
    }

    public DynamicPlan(Integer id, String name1, String name2, String name3, String name4, String unit, Double value, Integer type1, String typeOption1, String value1, Double time1, String timeString1, Integer type2, String typeOption2, String value2, Double time2, String timeString2, Integer type3, String typeOption3, String value3, Double time3, String timeString3, Integer type4, String typeOption4, String value4, Double time4, String timeString4, Integer type5, String typeOption5, String value5, Double time5, String timeString5, Integer type6, String typeOption6, String value6, Double time6, String timeString6, Integer type7, String typeOption7, String value7, Double time7, String timeString7, Integer type8, String typeOption8, String value8, Double time8, String timeString8, String charge1, String charge2, String charge3, String charge4, String info) {
        this.id = id;
        this.name1 = name1;
        this.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
        this.unit = unit;
        this.value = value;
        this.type1 = type1;
        this.typeOption1 = typeOption1;
        this.value1 = value1;
        this.time1 = time1;
        this.timeString1 = timeString1;
        this.type2 = type2;
        this.typeOption2 = typeOption2;
        this.value2 = value2;
        this.time2 = time2;
        this.timeString2 = timeString2;
        this.type3 = type3;
        this.typeOption3 = typeOption3;
        this.value3 = value3;
        this.time3 = time3;
        this.timeString3 = timeString3;
        this.type4 = type4;
        this.typeOption4 = typeOption4;
        this.value4 = value4;
        this.time4 = time4;
        this.timeString4 = timeString4;
        this.type5 = type5;
        this.typeOption5 = typeOption5;
        this.value5 = value5;
        this.time5 = time5;
        this.timeString5 = timeString5;
        this.type6 = type6;
        this.typeOption6 = typeOption6;
        this.value6 = value6;
        this.time6 = time6;
        this.timeString6 = timeString6;
        this.type7 = type7;
        this.typeOption7 = typeOption7;
        this.value7 = value7;
        this.time7 = time7;
        this.timeString7 = timeString7;
        this.type8 = type8;
        this.typeOption8 = typeOption8;
        this.value8 = value8;
        this.time8 = time8;
        this.timeString8 = timeString8;
        this.charge1 = charge1;
        this.charge2 = charge2;
        this.charge3 = charge3;
        this.charge4 = charge4;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getType1() {
        return type1;
    }

    public void setType1(Integer type1) {
        this.type1 = type1;
        this.typeOption1 = typeConvert(this.type1);
    }

    public String getTypeOption1() {
        return typeOption1;
    }

    public void setTypeOption1(String typeOption1) {
        this.typeOption1 = typeOption1;
        this.type1 = typeConvert(this.typeOption1);
    }

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public Double getTime1() {
        return time1;
    }

    public void setTime1(Double time1) {
        this.time1 = time1;
        this.timeString1 = timeConvert(this.time1);
    }

    public String getTimeString1() {
        return timeString1;
    }

    public void setTimeString1(String timeString1) {
        this.timeString1 = timeString1;
        this.time1 = timeConvert(this.timeString1);
    }

    public Integer getType2() {
        return type2;
    }

    public void setType2(Integer type2) {
        this.type2 = type2;
        this.typeOption2 = typeConvert(this.type2);
    }

    public String getTypeOption2() {
        return typeOption2;
    }

    public void setTypeOption2(String typeOption2) {
        this.typeOption2 = typeOption2;
        this.type2 = typeConvert(this.typeOption2);
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public Double getTime2() {
        return time2;
    }

    public void setTime2(Double time2) {
        this.time2 = time2;
        this.timeString2 = timeConvert(this.time2);
    }

    public String getTimeString2() {
        return timeString2;
    }

    public void setTimeString2(String timeString2) {
        this.timeString2 = timeString2;
        this.time2 = timeConvert(this.timeString2);
    }

    public Integer getType3() {
        return type3;
    }

    public void setType3(Integer type3) {
        this.type3 = type3;
        this.typeOption3 = typeConvert(this.type3);
    }

    public String getTypeOption3() {
        return typeOption3;
    }

    public void setTypeOption3(String typeOption3) {
        this.typeOption3 = typeOption3;
        this.type3 = typeConvert(this.typeOption3);
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public Double getTime3() {
        return time3;
    }

    public void setTime3(Double time3) {
        this.time3 = time3;
        this.timeString3 = timeConvert(this.time3);
    }

    public String getTimeString3() {
        return timeString3;
    }

    public void setTimeString3(String timeString3) {
        this.timeString3 = timeString3;
        this.time3 = timeConvert(this.timeString3);
    }

    public Integer getType4() {
        return type4;
    }

    public void setType4(Integer type4) {
        this.type4 = type4;
        this.typeOption4 = typeConvert(this.type4);
    }

    public String getTypeOption4() {
        return typeOption4;
    }

    public void setTypeOption4(String typeOption4) {
        this.typeOption4 = typeOption4;
        this.type4 = typeConvert(this.typeOption4);
    }

    public String getValue4() {
        return value4;
    }

    public void setValue4(String value4) {
        this.value4 = value4;
    }

    public Double getTime4() {
        return time4;
    }

    public void setTime4(Double time4) {
        this.time4 = time4;
        this.timeString4 = timeConvert(this.time4);
    }

    public String getTimeString4() {
        return timeString4;
    }

    public void setTimeString4(String timeString4) {
        this.timeString4 = timeString4;
        this.time4 = timeConvert(this.timeString4);
    }

    public Integer getType5() {
        return type5;
    }

    public void setType5(Integer type5) {
        this.type5 = type5;
        this.typeOption5 = typeConvert(this.type5);
    }

    public String getTypeOption5() {
        return typeOption5;
    }

    public void setTypeOption5(String typeOption5) {
        this.typeOption5 = typeOption5;
        this.type5 = typeConvert(this.typeOption5);
    }

    public String getValue5() {
        return value5;
    }

    public void setValue5(String value5) {
        this.value5 = value5;
    }

    public Double getTime5() {
        return time5;
    }

    public void setTime5(Double time5) {
        this.time5 = time5;
        this.timeString5 = timeConvert(this.time5);
    }

    public String getTimeString5() {
        return timeString5;
    }

    public void setTimeString5(String timeString5) {
        this.timeString5 = timeString5;
        this.time5 = timeConvert(this.timeString5);
    }

    public Integer getType6() {
        return type6;
    }

    public void setType6(Integer type6) {
        this.type6 = type6;
        this.typeOption6 = typeConvert(this.type6);
    }

    public String getTypeOption6() {
        return typeOption6;
    }

    public void setTypeOption6(String typeOption6) {
        this.typeOption6 = typeOption6;
        this.type6 = typeConvert(this.typeOption6);
    }

    public String getValue6() {
        return value6;
    }

    public void setValue6(String value6) {
        this.value6 = value6;
    }

    public Double getTime6() {
        return time6;
    }

    public void setTime6(Double time6) {
        this.time6 = time6;
        this.timeString6 = timeConvert(this.time6);
    }

    public String getTimeString6() {
        return timeString6;
    }

    public void setTimeString6(String timeString6) {
        this.timeString6 = timeString6;
        this.time6 = timeConvert(this.timeString6);
    }

    public Integer getType7() {
        return type7;
    }

    public void setType7(Integer type7) {
        this.type7 = type7;
        this.typeOption7 = typeConvert(this.type7);
    }

    public String getTypeOption7() {
        return typeOption7;
    }

    public void setTypeOption7(String typeOption7) {
        this.typeOption7 = typeOption7;
        this.type7 = typeConvert(this.typeOption7);
    }

    public String getValue7() {
        return value7;
    }

    public void setValue7(String value7) {
        this.value7 = value7;
    }

    public Double getTime7() {
        return time7;
    }

    public void setTime7(Double time7) {
        this.time7 = time7;
        this.timeString7 = timeConvert(this.time7);
    }

    public String getTimeString7() {
        return timeString7;
    }

    public void setTimeString7(String timeString7) {
        this.timeString7 = timeString7;
        this.time7 = timeConvert(this.timeString7);
    }

    public Integer getType8() {
        return type8;
    }

    public void setType8(Integer type8) {
        this.type8 = type8;
        this.typeOption8 = typeConvert(this.type8);
    }

    public String getTypeOption8() {
        return typeOption8;
    }

    public void setTypeOption8(String typeOption8) {
        this.typeOption8 = typeOption8;
        this.type8 = typeConvert(this.typeOption8);
    }

    public String getValue8() {
        return value8;
    }

    public void setValue8(String value8) {
        this.value8 = value8;
    }

    public Double getTime8() {
        return time8;
    }

    public void setTime8(Double time8) {
        this.time8 = time8;
        this.timeString8 = timeConvert(this.time8);
    }

    public String getTimeString8() {
        return timeString8;
    }

    public void setTimeString8(String timeString8) {
        this.timeString8 = timeString8;
        this.time8 = timeConvert(this.timeString8);
    }

    public String getCharge1() {
        return charge1;
    }

    public void setCharge1(String charge1) {
        this.charge1 = charge1;
    }

    public String getCharge2() {
        return charge2;
    }

    public void setCharge2(String charge2) {
        this.charge2 = charge2;
    }

    public String getCharge3() {
        return charge3;
    }

    public void setCharge3(String charge3) {
        this.charge3 = charge3;
    }

    public String getCharge4() {
        return charge4;
    }

    public void setCharge4(String charge4) {
        this.charge4 = charge4;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<DynamicItem> getItems() {
        return items;
    }

    public void setItems(List<DynamicItem> items) {
        this.items = items;
    }

    public String trimChar(String str, char ch, int pos) {
        if(str.length() == 0) {
            return str;
        }

        String _str = str;
        if(_str.indexOf(ch) == 0 && (pos==0 || pos ==-1)){
            _str = _str.substring(1,str.length());   //去掉第一个 "
        }

        if(_str.lastIndexOf(ch)==(_str.length()-1)&& (pos==0 || pos == 1)){
            _str = _str.substring(0,_str.length()-1);
        }

        return _str;
    }

    public String trimChar(String str) {
        return trimChar(str, '\"', 0);
    }

    public void initItems() {
        if(items != null) {
            items.clear();
        } else {
            items = new ArrayList<>();
        }

        items.add(new DynamicItem(type1,typeOption1,value1,time1,timeString1));
        items.add(new DynamicItem(type2,typeOption2,value2,time2,timeString2));
        items.add(new DynamicItem(type3,typeOption3,value3,time3,timeString3));
        items.add(new DynamicItem(type4,typeOption4,value4,time4,timeString4));
        items.add(new DynamicItem(type5,typeOption5,value5,time5,timeString5));
        items.add(new DynamicItem(type6,typeOption6,value6,time6,timeString6));
        items.add(new DynamicItem(type7,typeOption7,value7,time7,timeString7));
        items.add(new DynamicItem(type8,typeOption8,value8,time8,timeString8));
    }

    public void spreadItem(Integer index) {
        DynamicItem item = items.get(index);
        switch (index) {
            case 1:
                setType1(item.getType());
                setValue1(item.getValue());
                setTime1(item.getTime());
                break;
            case 2:
                setType2(item.getType());
                setValue2(item.getValue());
                setTime2(item.getTime());
                break;
            case 3:
                setType3(item.getType());
                setValue3(item.getValue());
                setTime3(item.getTime());
                break;
            case 4:
                setType4(item.getType());
                setValue4(item.getValue());
                setTime4(item.getTime());
                break;
            case 5:
                setType5(item.getType());
                setValue5(item.getValue());
                setTime5(item.getTime());
                break;
            case 6:
                setType6(item.getType());
                setValue6(item.getValue());
                setTime6(item.getTime());
                break;
            case 7:
                setType7(item.getType());
                setValue7(item.getValue());
                setTime7(item.getTime());
                break;
            case 8:
                setType8(item.getType());
                setValue8(item.getValue());
                setTime8(item.getTime());
                break;
        }

    }

    public DynamicItem getItem(Integer index) {
        return items.get(index);
    }

    public void updateTime(Integer index, double time) {
        Double span = items.get(index).getTime()-time;
        for(int i=index; i<items.size(); i++) {
            DynamicItem item = items.get(i);
            item.setTime(item.getTime() + span);
            item.setFlag(span.compareTo(0.0));
        }
    }

    public void updateTime(Integer index, Date date) {
        Double time = HSSFDateUtil.getExcelDate(date);
        Double span = items.get(index).getTime()-time;
        for(int i=index; i<items.size(); i++) {
            DynamicItem item = items.get(i);
            item.setTime(item.getTime() + span);
            item.setFlag(span.compareTo(0.0));
        }
    }

    public void setItem(Integer index, DynamicItem item) {
        items.set(index,item);
    }

    public void delItem(DynamicItem item) {
        items.remove(item);
    }

    public void addItem(DynamicItem item) {
        items.add(item);
    }

    public Integer itemIndex(DynamicItem item) {
        return items.indexOf(item);
    }

    public Integer itemsSize() {
        return items.size();
    }

    public void setMap(Map map) {
        if (map.containsKey("id")) {
            Object _value = map.get("id");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                id = Integer.parseInt(value);
            }
        }
        if (map.containsKey("name1")) {
            Object value = map.get("name1");
            name1 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("name2")) {
            Object value = map.get("name2");
            name2 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("name3")) {
            Object value = map.get("name3");
            name3 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("name4")) {
            Object value = map.get("name4");
            name4 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("unit")) {
            Object value = map.get("unit");
            unit = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("value")) {
            Object _value = map.get("value");
            String __value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(__value)) {
                value = Double.parseDouble(__value);
            }
        }
        if (map.containsKey("type1")) {
            Object _value = map.get("type1");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType1(Integer.parseInt(value));
            }
        }
        if (map.containsKey("value1")) {
            Object value = map.get("value1");
            value1 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("time1")) {
            Object _value = map.get("time1");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime1(Double.parseDouble(value));
            }
        }
        if (map.containsKey("type2")) {
            Object _value = map.get("type2");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType2(Integer.parseInt(value));
            }
        }
        if (map.containsKey("value2")) {
            Object value = map.get("value2");
            value2 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("time2")) {
            Object _value = map.get("time2");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime2(Double.parseDouble(value));
            }
        }
        if (map.containsKey("type3")) {
            Object _value = map.get("type3");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType3(Integer.parseInt(value));
            }
        }
        if (map.containsKey("value3")) {
            Object value = map.get("value3");
            value3 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("time3")) {
            Object _value = map.get("time3");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime3(Double.parseDouble(value));
            }
        }
        if (map.containsKey("type4")) {
            Object _value = map.get("type4");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType4(Integer.parseInt(value));
            }
        }
        if (map.containsKey("value4")) {
            Object value = map.get("value4");
            value4 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("time4")) {
            Object _value = map.get("time4");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime4(Double.parseDouble(value));
            }
        }
        if (map.containsKey("type5")) {
            Object _value = map.get("type5");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType5(Integer.parseInt(value));
            }
        }
        if (map.containsKey("value5")) {
            Object value = map.get("value5");
            value5 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("time5")) {
            Object _value = map.get("time5");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime5(Double.parseDouble(value));
            }
        }
        if (map.containsKey("type6")) {
            Object _value = map.get("type6");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType6(Integer.parseInt(value));
            }
        }
        if (map.containsKey("value6")) {
            Object value = map.get("value6");
            value6 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("time6")) {
            Object _value = map.get("time6");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime6(Double.parseDouble(value));
            }
        }
        if (map.containsKey("type7")) {
            Object _value = map.get("type7");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType7(Integer.parseInt(value));
            }
        }
        if (map.containsKey("value7")) {
            Object value = map.get("value7");
            value7 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("time7")) {
            Object _value = map.get("time7");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime7(Double.parseDouble(value));
            }
        }
        if (map.containsKey("type8")) {
            Object _value = map.get("type8");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType8(Integer.parseInt(value));
            }
        }
        if (map.containsKey("value8")) {
            Object value = map.get("value8");
            value8 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("time8")) {
            Object _value = map.get("time8");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime8(Double.parseDouble(value));
            }
        }
        if (map.containsKey("charge1")) {
            Object value = map.get("charge1");
            charge1 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("charge2")) {
            Object value = map.get("charge2");
            charge2 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("charge3")) {
            Object value = map.get("charge3");
            charge3 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("charge4")) {
            Object value = map.get("charge4");
            charge4 = value != null ? trimChar(value.toString()):"";
        }
        if (map.containsKey("info")) {
            Object value = map.get("info");
            info = value != null ? trimChar(value.toString()):"";
        }

        initItems();
    }

    public Map toMap() {
        Map map = new HashMap<>();
        map.put("id", id);
        map.put("name1", name1);
        map.put("name2", name2);
        map.put("name3", name3);
        map.put("name4", name4);
        map.put("unit", unit);
        map.put("value", value);
        map.put("type1", type1);
        map.put("typeOption1", typeOption1);
        map.put("value1", value1);
        map.put("time1", time1);
        map.put("timeString1", timeString1);
        map.put("type2", type2);
        map.put("typeOption2", typeOption2);
        map.put("value2", value2);
        map.put("time2", time2);
        map.put("timeString2", timeString2);
        map.put("type3", type3);
        map.put("typeOption3", typeOption3);
        map.put("value3", value3);
        map.put("time3", time3);
        map.put("timeString3", timeString3);
        map.put("type4", type4);
        map.put("typeOption4", typeOption4);
        map.put("value4", value4);
        map.put("time4", time4);
        map.put("timeString4", timeString4);
        map.put("type5", type5);
        map.put("typeOption5", typeOption5);
        map.put("value5", value5);
        map.put("time5", time5);
        map.put("timeString5", timeString5);
        map.put("type6", type6);
        map.put("typeOption6", typeOption6);
        map.put("value6", value6);
        map.put("time6", time6);
        map.put("timeString6", timeString6);
        map.put("type7", type7);
        map.put("typeOption7", typeOption7);
        map.put("value7", value7);
        map.put("time7", time7);
        map.put("timeString7", timeString7);
        map.put("type8", type8);
        map.put("typeOption8", typeOption8);
        map.put("value8", value8);
        map.put("time1", time8);
        map.put("timeString8", timeString8);
        map.put("charge1", charge1);
        map.put("charge2", charge2);
        map.put("charge3", charge3);
        map.put("charge4", charge4);
        map.put("items", items);
        map.put("info", info);
        return map;
    }

    public void setJSON(JSONObject json) {
        if (json.containsKey("id")) {
            Object _value = json.get("id");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                id = Integer.parseInt(value);
            }
        }
        if (json.containsKey("name1")) {
            Object value = json.get("name1");
            name1 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("name2")) {
            Object value = json.get("name2");
            name2 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("name3")) {
            Object value = json.get("name3");
            name3 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("name4")) {
            Object value = json.get("name4");
            name4 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("unit")) {
            Object value = json.get("unit");
            unit = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("value")) {
            Object _value = json.get("value");
            String __value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(__value)) {
                value = Double.parseDouble(__value);
            }
        }
        if (json.containsKey("type1")) {
            Object _value = json.get("type1");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType1(Integer.parseInt(value));
            }
        }
        if (json.containsKey("value1")) {
            Object value = json.get("value1");
            value1 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("time1")) {
            Object _value = json.get("time1");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime1(Double.parseDouble(value));
            }
        }
        if (json.containsKey("type2")) {
            Object _value = json.get("type2");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType2(Integer.parseInt(value));
            }
        }
        if (json.containsKey("value2")) {
            Object value = json.get("value2");
            value2 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("time2")) {
            Object _value = json.get("time2");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime2(Double.parseDouble(value));
            }
        }
        if (json.containsKey("type3")) {
            Object _value = json.get("type3");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType3(Integer.parseInt(value));
            }
        }
        if (json.containsKey("value3")) {
            Object value = json.get("value3");
            value3 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("time3")) {
            Object _value = json.get("time3");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime3(Double.parseDouble(value));
            }
        }
        if (json.containsKey("type4")) {
            Object _value = json.get("type4");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType4(Integer.parseInt(value));
            }
        }
        if (json.containsKey("value4")) {
            Object value = json.get("value4");
            value4 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("time4")) {
            Object _value = json.get("time4");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime4(Double.parseDouble(value));
            }
        }
        if (json.containsKey("type5")) {
            Object _value = json.get("type5");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType5(Integer.parseInt(value));
            }
        }
        if (json.containsKey("value5")) {
            Object value = json.get("value5");
            value5 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("time5")) {
            Object _value = json.get("time5");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime5(Double.parseDouble(value));
            }
        }
        if (json.containsKey("type6")) {
            Object _value = json.get("type6");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType6(Integer.parseInt(value));
            }
        }
        if (json.containsKey("value6")) {
            Object value = json.get("value6");
            value6 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("time6")) {
            Object _value = json.get("time6");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime6(Double.parseDouble(value));
            }
        }
        if (json.containsKey("type7")) {
            Object _value = json.get("type7");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType7(Integer.parseInt(value));
            }
        }
        if (json.containsKey("value7")) {
            Object value = json.get("value7");
            value7 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("time7")) {
            Object _value = json.get("time7");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime7(Double.parseDouble(value));
            }
        }
        if (json.containsKey("type8")) {
            Object _value = json.get("type8");
            String value = _value != null ? _value.toString():"0";
            if(RegexUtil.isNumber(value)) {
                setType8(Integer.parseInt(value));
            }
        }
        if (json.containsKey("value8")) {
            Object value = json.get("value8");
            value8 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("time8")) {
            Object _value = json.get("time8");
            String value = _value != null ? _value.toString():"25569";
            if(RegexUtil.isNumber(value)) {
                setTime8(Double.parseDouble(value));
            }
        }
        if (json.containsKey("charge1")) {
            Object value = json.get("charge1");
            charge1 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("charge2")) {
            Object value = json.get("charge2");
            charge2 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("charge3")) {
            Object value = json.get("charge3");
            charge3 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("charge4")) {
            Object value = json.get("charge4");
            charge4 = value != null ? trimChar(value.toString()):"";
        }
        if (json.containsKey("info")) {
            Object value = json.get("info");
            info = value != null ? trimChar(value.toString()):"";
        }

        initItems();
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("id", id);
        json.put("name1", name1);
        json.put("name2", name2);
        json.put("name3", name3);
        json.put("name4", name4);
        json.put("unit", unit);
        json.put("value", value);
        json.put("type1", type1);
        json.put("typeOption1", typeOption1);
        json.put("value1", value1);
        json.put("time1", time1);
        json.put("timeString1", timeString1);
        json.put("type2", type2);
        json.put("typeOption2", typeOption2);
        json.put("value2", value2);
        json.put("time2", time2);
        json.put("timeString2", timeString2);
        json.put("type3", type3);
        json.put("typeOption3", typeOption3);
        json.put("value3", value3);
        json.put("time3", time3);
        json.put("timeString3", timeString3);
        json.put("type4", type4);
        json.put("typeOption4", typeOption4);
        json.put("value4", value4);
        json.put("time4", time4);
        json.put("timeString4", timeString4);
        json.put("type5", type5);
        json.put("typeOption5", typeOption5);
        json.put("value5", value5);
        json.put("time5", time5);
        json.put("timeString5", timeString5);
        json.put("type6", type6);
        json.put("typeOption6", typeOption6);
        json.put("value6", value6);
        json.put("time6", time6);
        json.put("timeString6", timeString6);
        json.put("type7", type7);
        json.put("typeOption7", typeOption7);
        json.put("value7", value7);
        json.put("time7", time7);
        json.put("timeString7", timeString7);
        json.put("type8", type8);
        json.put("typeOption8", typeOption8);
        json.put("value8", value8);
        json.put("time1", time8);
        json.put("timeString8", timeString8);
        json.put("charge1", charge1);
        json.put("charge2", charge2);
        json.put("charge3", charge3);
        json.put("charge4", charge4);
        json.put("items", items);
        json.put("info", info);
        return json;
    }

    public JSONObject toNameJson() {
        JSONObject json = new JSONObject();
        json.put("name1", name1);
        json.put("name2", name2);
        json.put("name3", name3);
        json.put("name4", name4);
        json.put("unit", unit);
        json.put("value", value);
        json.put("charge1", charge1);
        json.put("charge2", charge2);
        json.put("charge3", charge3);
        json.put("charge4", charge4);
        return json;
    }

    public JSONArray toValueJson() {
        JSONArray jsons = new JSONArray();
        JSONObject json = new JSONObject();
        json.put("type", type1);
        json.put("value", value1);
        json.put("time", time1);
        jsons.add(json);
        json.clear();
        json.put("type", type2);
        json.put("value", value2);
        json.put("time", time2);
        jsons.add(json);
        json.clear();
        json.put("type", type3);
        json.put("value", value3);
        json.put("time", time3);
        jsons.add(json);
        json.clear();
        json.put("type", type4);
        json.put("value", value4);
        json.put("time", time4);
        jsons.add(json);
        json.clear();
        json.put("type", type5);
        json.put("value", value5);
        json.put("time", time5);
        jsons.add(json);
        json.clear();
        json.put("type", type6);
        json.put("value", value6);
        json.put("time", time6);
        jsons.add(json);
        json.clear();
        json.put("type", type7);
        json.put("value", value7);
        json.put("time", time7);
        jsons.add(json);
        json.clear();
        json.put("type", type8);
        json.put("value", value8);
        json.put("time", time8);
        jsons.add(json);
        return jsons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicPlan that = (DynamicPlan) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name1, that.name1) &&
                Objects.equals(name2, that.name2) &&
                Objects.equals(name3, that.name3) &&
                Objects.equals(name4, that.name4) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(value, that.value) &&
                Objects.equals(type1, that.type1) &&
                Objects.equals(typeOption1, that.typeOption1) &&
                Objects.equals(value1, that.value1) &&
                Objects.equals(time1, that.time1) &&
                Objects.equals(timeString1, that.timeString1) &&
                Objects.equals(type2, that.type2) &&
                Objects.equals(typeOption2, that.typeOption2) &&
                Objects.equals(value2, that.value2) &&
                Objects.equals(time2, that.time2) &&
                Objects.equals(timeString2, that.timeString2) &&
                Objects.equals(type3, that.type3) &&
                Objects.equals(typeOption3, that.typeOption3) &&
                Objects.equals(value3, that.value3) &&
                Objects.equals(time3, that.time3) &&
                Objects.equals(timeString3, that.timeString3) &&
                Objects.equals(type4, that.type4) &&
                Objects.equals(typeOption4, that.typeOption4) &&
                Objects.equals(value4, that.value4) &&
                Objects.equals(time4, that.time4) &&
                Objects.equals(timeString4, that.timeString4) &&
                Objects.equals(type5, that.type5) &&
                Objects.equals(typeOption5, that.typeOption5) &&
                Objects.equals(value5, that.value5) &&
                Objects.equals(time5, that.time5) &&
                Objects.equals(timeString5, that.timeString5) &&
                Objects.equals(type6, that.type6) &&
                Objects.equals(typeOption6, that.typeOption6) &&
                Objects.equals(value6, that.value6) &&
                Objects.equals(time6, that.time6) &&
                Objects.equals(timeString6, that.timeString6) &&
                Objects.equals(type7, that.type7) &&
                Objects.equals(typeOption7, that.typeOption7) &&
                Objects.equals(value7, that.value7) &&
                Objects.equals(time7, that.time7) &&
                Objects.equals(timeString7, that.timeString7) &&
                Objects.equals(type8, that.type8) &&
                Objects.equals(typeOption8, that.typeOption8) &&
                Objects.equals(value8, that.value8) &&
                Objects.equals(time8, that.time8) &&
                Objects.equals(timeString8, that.timeString8) &&
                Objects.equals(charge1, that.charge1) &&
                Objects.equals(charge2, that.charge2) &&
                Objects.equals(charge3, that.charge3) &&
                Objects.equals(charge4, that.charge4) &&
                Objects.equals(items, that.items) &&
                Objects.equals(info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name1, name2, name3, name4, unit, value, type1, typeOption1, value1, time1, timeString1, type2, typeOption2, value2, time2, timeString2, type3, typeOption3, value3, time3, timeString3, type4, typeOption4, value4, time4, timeString4, type5, typeOption5, value5, time5, timeString5, type6, typeOption6, value6, time6, timeString6, type7, typeOption7, value7, time7, timeString7, type8, typeOption8, value8, time8, timeString8, charge1, charge2, charge3, charge4, items, info);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DynamicPlan{");
        sb.append("id=").append(id);
        sb.append(", name1='").append(name1).append('\'');
        sb.append(", name2='").append(name2).append('\'');
        sb.append(", name3='").append(name3).append('\'');
        sb.append(", name4='").append(name4).append('\'');
        sb.append(", unit='").append(unit).append('\'');
        sb.append(", value=").append(value);
        sb.append(", type1=").append(type1);
        sb.append(", typeOption1='").append(typeOption1).append('\'');
        sb.append(", value1='").append(value1).append('\'');
        sb.append(", time1=").append(time1);
        sb.append(", timeString1='").append(timeString1).append('\'');
        sb.append(", type2=").append(type2);
        sb.append(", typeOption2='").append(typeOption2).append('\'');
        sb.append(", value2='").append(value2).append('\'');
        sb.append(", time2=").append(time2);
        sb.append(", timeString2='").append(timeString2).append('\'');
        sb.append(", type3=").append(type3);
        sb.append(", typeOption3='").append(typeOption3).append('\'');
        sb.append(", value3='").append(value3).append('\'');
        sb.append(", time3=").append(time3);
        sb.append(", timeString3='").append(timeString3).append('\'');
        sb.append(", type4=").append(type4);
        sb.append(", typeOption4='").append(typeOption4).append('\'');
        sb.append(", value4='").append(value4).append('\'');
        sb.append(", time4=").append(time4);
        sb.append(", timeString4='").append(timeString4).append('\'');
        sb.append(", type5=").append(type5);
        sb.append(", typeOption5='").append(typeOption5).append('\'');
        sb.append(", value5='").append(value5).append('\'');
        sb.append(", time5=").append(time5);
        sb.append(", timeString5='").append(timeString5).append('\'');
        sb.append(", type6=").append(type6);
        sb.append(", typeOption6='").append(typeOption6).append('\'');
        sb.append(", value6='").append(value6).append('\'');
        sb.append(", time6=").append(time6);
        sb.append(", timeString6='").append(timeString6).append('\'');
        sb.append(", type7=").append(type7);
        sb.append(", typeOption7='").append(typeOption7).append('\'');
        sb.append(", value7='").append(value7).append('\'');
        sb.append(", time7=").append(time7);
        sb.append(", timeString7='").append(timeString7).append('\'');
        sb.append(", type8=").append(type8);
        sb.append(", typeOption8='").append(typeOption8).append('\'');
        sb.append(", value8='").append(value8).append('\'');
        sb.append(", time8=").append(time8);
        sb.append(", timeString8='").append(timeString8).append('\'');
        sb.append(", charge1='").append(charge1).append('\'');
        sb.append(", charge2='").append(charge2).append('\'');
        sb.append(", charge3='").append(charge3).append('\'');
        sb.append(", charge4='").append(charge4).append('\'');
        sb.append(", items=").append(items);
        sb.append(", info='").append(info).append('\'');
        sb.append('}');
        return sb.toString();
    }
}