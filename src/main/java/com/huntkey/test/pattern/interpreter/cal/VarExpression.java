package com.huntkey.test.pattern.interpreter.cal;

import java.util.HashMap;

/**
 * Created by lulx on 2017/9/1 0001 上午 9:13
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
