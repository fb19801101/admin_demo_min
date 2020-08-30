package com.dateutil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-02-20 11:23
 */
public class EncodeUtil {
    /**
     * 自定义编码格式 UTF-8、ISO-8859-1、GBK、GB2312
     */
    private static final String ENCODE_UTF = "UTF-8";
    private static final String ENCODE_ISO = "ISO-8859-1";
    private static final String ENCODE_GBK = "GBK";

    public static void setEncoderGBK(HttpServletRequest request, HttpServletResponse response) {
        try {
            if(request != null) {
                request.setCharacterEncoding(ENCODE_GBK);
            }
            if(response != null) {
                response.setCharacterEncoding(ENCODE_GBK);
            }
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_GBK);
        }
    }

    public static void setEncoderISO(HttpServletRequest request, HttpServletResponse response) {
        try {
            if(request != null) {
                request.setCharacterEncoding(ENCODE_ISO);
            }
            if(response != null) {
                response.setCharacterEncoding(ENCODE_ISO);
            }
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_ISO);
        }
    }

    public static void setEncoderUTF(HttpServletRequest request, HttpServletResponse response) {
        try {
            if(request != null) {
                request.setCharacterEncoding(ENCODE_UTF);
            }
            if(response != null) {
                response.setCharacterEncoding(ENCODE_UTF);
            }
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String formatHtml(String str) {
        String fmt = "";
        if(str !=null && !str.equals("")) {
            fmt = str.replace("&","&amp;");
            fmt = fmt.replace(" ","&nbsp;");
            fmt = fmt.replace("<","&lt;");
            fmt = fmt.replace(">","&gt;");
            fmt = fmt.replace("\"","&quot;");
            fmt = fmt.replace("\r\n","<br>");
        }
        return fmt;
    }

    public static String encodeUTFtoISO(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return new String(str.getBytes(ENCODE_UTF), ENCODE_ISO);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String encodeUTFtoGBK(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return new String(str.getBytes(ENCODE_UTF), ENCODE_GBK);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String encodeGBKtoUTF(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return new String(str.getBytes(ENCODE_GBK), ENCODE_UTF);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String encodeGBKtoISO(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return new String(str.getBytes(ENCODE_GBK), ENCODE_ISO);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String encodeISOtoUTF(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return new String(str.getBytes(ENCODE_ISO), ENCODE_UTF);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String encodeISOtoGBK(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return new String(str.getBytes(ENCODE_ISO), ENCODE_GBK);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String encodeURLtoUTF(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return URLEncoder.encode(str, ENCODE_UTF);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String encodeURLtoGBK(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return URLEncoder.encode(str, ENCODE_GBK);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }

    public static String encodeURLtoISO(String str) {
        try {
            if(str !=null && !str.equals("")) {
                return URLEncoder.encode(str, ENCODE_ISO);
            }
            return str;
        } catch (IOException ex) {
            throw new IllegalArgumentException("无效的编码格式，请使用这种格式："+ENCODE_UTF);
        }
    }
}
