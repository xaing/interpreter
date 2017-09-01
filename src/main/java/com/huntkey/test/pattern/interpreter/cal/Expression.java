package com.huntkey.test.pattern.interpreter.cal;

import java.util.HashMap;

/**
 * Created by lulx on 2017/9/1 0001 上午 9:11
 */
public abstract class Expression {
    public abstract int interpreter(HashMap<String,Integer> var);
}
