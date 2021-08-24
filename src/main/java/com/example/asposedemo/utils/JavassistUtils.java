package com.example.asposedemo.utils;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class JavassistUtils {
    public static void main(String[] args) throws Exception {

        // https://www.icode9.com/content-1-353692.html
//        https://blog.perhamer.com/page/20y5m8s01.html
//        crackWords();
//        crackSlides();
//        crackCells();
    }

    private  static  String getLibPath() {
        String classFilePath = JavassistUtils.class.getResource("/").getPath();
        String libPath = classFilePath + "/BOOT-INF/lib/";
        return libPath;
    }
    private static void crackWords() throws Exception {
        ClassPool.getDefault().insertClassPath("C:\\Users\\AT\\Desktop\\aspose\\aspose-words-20.4-jdk17.jar");
        CtClass zzZJJClass = ClassPool.getDefault().getCtClass("com.aspose.words.zzZJJ");
        CtMethod zzv = zzZJJClass.getDeclaredMethod("zzZbN");
        zzv.setBody("{return 1;}");
        zzZJJClass.writeFile("C:\\Users\\AT\\Desktop\\aspose\\modify");
    }

    private static void crackSlides() throws Exception {
        ClassPool.getDefault().insertClassPath("C:\\Users\\AT\\Desktop\\aspose\\aspose-slides-20.4-jdk16.jar");
        CtClass ctClass = ClassPool.getDefault().getCtClass("com.aspose.slides.y6");
        ctClass.getDeclaredMethod("if").setName("tempListIf");
        ctClass.getDeclaredMethod("if").setBody("{return 1;}");
        ctClass.getDeclaredMethod("tempListIf").setName("if");
        ctClass.writeFile("C:\\Users\\AT\\Desktop\\aspose\\modify");
    }

    private static void crackCells() throws Exception {
        ClassPool.getDefault().insertClassPath("C:\\Users\\AT\\Desktop\\aspose\\aspose-cells-20.4.jar");
        CtClass zzZJJClass = ClassPool.getDefault().getCtClass("com.aspose.cells.zasj");
        CtMethod zzv = zzZJJClass.getDeclaredMethod("a");
        zzv.setBody("{return 1;}");
        zzZJJClass.writeFile("C:\\Users\\AT\\Desktop\\aspose\\modify");
    }
}
