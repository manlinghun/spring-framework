package com.springlearn;

public class RunMain {

    public static void main(String[] args) {
        System.out.println("hellow world");
        printStr("hhhhhhh");

        String classPath = "classpath*:spring-beanannotation.xml";
        String[] strArray = classPath.split("[,\\s]+");
        for (String str : strArray) {
            printStr("(="+str+"=)");
        }

    }

    public static void printStr(String str){
        System.out.println(str);
    }
}
