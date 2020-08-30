package com.exceltest.converter;

import com.dateutil.DateConverter;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;

import java.util.Date;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-07-22 17:43
 *
 * 实现com.wuwenze.poi.convert.WriteConverter以及com.wuwenze.poi.convert.ReadConverter单元格读写转换器。
 */
public class ExcelDateWriteConverter  {
    public String strDate(Double value) {
        Date date = HSSFDateUtil.getJavaDate(value);
        return DateConverter.dateToStr(date);
    }

    public String strDate(Double value, String format) {
        Date date = HSSFDateUtil.getJavaDate(value);
        return DateConverter.dateToStr(date, format);
    }

    public Double dblDate(String value) {
        Date date = DateConverter.strToDate(value);
        return HSSFDateUtil.getExcelDate(date);
    }
}
