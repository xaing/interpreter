package com.huntkey.test.pattern.interpreter.cal;

import java.util.HashMap;

/**
 * Created by lulx on 2017/9/4 0004 下午 2:34
 */
public class TestCal {
    public static void main(String[] args) {
        String expStr = "5+b-c";
        HashMap<String,Integer> var = new HashMap<String, Integer>();
        var.put("a",1);
        var.put("b",2);
        var.put("c",3);
        Calculator calculator = new Calculator(expStr);
        int run = calculator.run(var);
        System.out.println("Result: " + run);
    }
}
