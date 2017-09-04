package com.huntkey.test.pattern.interpreter.convertor;

/**
 * Created by lulx on 2017/9/4 0004 下午 2:35
 */
public class TestConvertor {
    public static void main(String[] args) {
        String chineseNum = "四百九十六万二千三百一十五";
        Convertor conv = new Convertor(chineseNum);
        conv.convert();
        System.out.println("Result: 4962315 || " + conv.getRoman());

        chineseNum = "九千零五万六千零七十二";
        conv.setChineseNum(chineseNum);
        conv.convert();
        System.out.println("Result: 90056072 || " + conv.getRoman());
    }
}
