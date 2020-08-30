package com.exceltest.options;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-07-22 17:41
 *
 * 通过实现com.wuwenze.poi.config.Options自定义导入模板的下拉框数据源
 */
public class TypeOptions{
    private static String[] options = {"-----","WORK","-----","Y6","Y8","Y10","-----","H12","H14","H16","H18","H20","H22","H25","H28","H32","H36","-----","C15","C20","C25","C30","C35","C40","C50","C55","C60","-----","SC20","SC25","SC30","-----"};

    public String[] get() {
        return options;
    }

    public Integer index(String type) {
        for(int i=0; i<options.length; i++) {
            if(options[i].equals(type)) {
                return i;
            }
        }
        return 0;
    }

    public String type(Integer index) {
        return options[index];
    }
}
