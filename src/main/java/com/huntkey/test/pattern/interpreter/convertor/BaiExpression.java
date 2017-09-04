package com.huntkey.test.pattern.interpreter.convertor;

/**
 * Created by lulx on 2017/9/1 0001 下午 4:19
 */
public class BaiExpression extends Expression {
    public String getPostfix() {
        return "百";
    }

    public int multiplier() {
        return 100;
    }
}
