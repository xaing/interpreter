package com.huntkey.test.pattern.interpreter.convertor;

/**
 * Created by lulx on 2017/9/1 0001 下午 4:18
 */
public class ShiExpression extends Expression {
    public String getPostfix() {
        return "十";
    }

    public int multiplier() {
        return 10;
    }
}
