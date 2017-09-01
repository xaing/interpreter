package com.huntkey.test.pattern.interpreter.cal;

/**
 * Created by lulx on 2017/9/1 0001 上午 9:16
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }
}
