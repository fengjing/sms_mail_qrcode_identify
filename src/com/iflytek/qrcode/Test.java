package com.iflytek.qrcode;
/**
 * @author	kwliu
 * @date	2016年4月26日 下午3:43:13
 * @version	1.0
 */
import java.io.File;  
import java.util.Hashtable;  
  

import com.google.zxing.BarcodeFormat;  
import com.google.zxing.EncodeHintType;  
import com.google.zxing.MultiFormatWriter;  
import com.google.zxing.common.BitMatrix;  
  
public class Test {  
  
    /** 
     * @param args 
     * @throws Exception  
     */  
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception {  
        String text = "http://www.baidu.com";  
        int width = 300;  
        int height = 300;  
        //二维码的图片格式  
        String format = "gif";  
        Hashtable hints = new Hashtable();  
        //内容所使用编码  
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");  
        BitMatrix bitMatrix = new MultiFormatWriter().encode(text,  
                BarcodeFormat.QR_CODE, width, height, hints);  
        //生成二维码  
        File outputFile = new File("d:"+File.separator+"new.gif");  
        MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);  
    }  
}  
