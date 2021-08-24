package com.example.asposedemo.utils;

import com.aspose.cells.Workbook;
import com.aspose.slides.Presentation;
import com.aspose.words.Document;
import com.aspose.words.SaveFormat;

import java.io.File;
import java.io.FileOutputStream;


/**
 * @author Administrator
 * @version $Id$
 * @see
 * @since
 */
public class AsposeUtils {
//    https://blog.csdn.net/qq_41853447/article/details/107715704
    public static void main(String[] args) {
        if (false){
            String inPath = "/Users/yans/Documents/github/aspose-demo/src/main/resources/static/test.docx";
            String outPath = "/Users/yans/Documents/github/aspose-demo/src/main/resources/static/test.docx.pdf";
            words2pdf(inPath, outPath);
        }

        if (true){
            String inPath = "/Users/yans/Documents/github/aspose-demo/src/main/resources/static/test2.xls";
            String outPath = "/Users/yans/Documents/github/aspose-demo/src/main/resources/static/test2.xls.pdf";
            cells2pdf(inPath, outPath);
        }

        if (false){
            String inPath = "/Users/yans/Documents/github/aspose-demo/src/main/resources/static/test.docx";
            String outPath = "/Users/yans/Documents/github/aspose-demo/src/main/resources/static/test.docx.pdf";
            slides2pdf(inPath, outPath);
        }

        // pdf 转 office 需要windows 支持
        if (false){
            String inPath = "/Users/yans/Documents/github/aspose-demo/src/main/resources/static/test.docx.pdf";
            String outPath = "/Users/yans/Documents/github/aspose-demo/src/main/resources/static/test2.docx";
            pdf2words(inPath, outPath);
        }
    }

    public static void words2pdf(String inPath, String outPath) {
        try {
            long old = System.currentTimeMillis();
            File file = new File(outPath); // 新建一个空白pdf文档
            FileOutputStream os = new FileOutputStream(file);
            Document doc = new Document(inPath); // Address是将要被转化的word文档
            doc.save(os, com.aspose.words.SaveFormat.PDF);// 全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF,
            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cells2pdf(String inPath, String outPath) {
        try {
            long old = System.currentTimeMillis();
            File file = new File(outPath); // 新建一个空白pdf文档
            FileOutputStream os = new FileOutputStream(file);
            Workbook wb = new Workbook(inPath);// 原始excel路径
            wb.save(os, com.aspose.cells.SaveFormat.PDF);
            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void slides2pdf(String inPath, String outPath) {
        try {
            long old = System.currentTimeMillis();
            File file = new File(outPath); // 新建一个空白pdf文档
            FileOutputStream os = new FileOutputStream(file);
            Presentation pres = new Presentation(inPath);
            pres.save(os, com.aspose.slides.SaveFormat.Pdf);
            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void pdf2words(String inPath, String outPath) {
        try {
            long old = System.currentTimeMillis();
            File file = new File(outPath); // 新建一个空白pdf文档
            FileOutputStream os = new FileOutputStream(file);
            Document doc = new Document(inPath); // Address是将要被转化的word文档
            doc.save(os, SaveFormat.DOCX);// 全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF,
            long now = System.currentTimeMillis();
            System.out.println("共耗时：" + ((now - old) / 1000.0) + "秒"); // 转化用时
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
