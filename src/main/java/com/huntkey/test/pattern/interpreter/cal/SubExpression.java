package com.huntkey.test.pattern.interpreter.cal;

import java.util.HashMap;

/**
 * Created by lulx on 2017/9/1 0001 上午 9:20
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
