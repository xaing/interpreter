package com.huntkey.test.pattern.interpreter.control;

/**
 * Created by lulx on 2017/9/4 0004 下午 2:39
 * And解释器：非终结符表达式
 */
public class AndExpression extends AbstractExpression {

    private AbstractExpression left;
    private AbstractExpression right;

    public AndExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    public AbstractExpression getLeft() {
        return left;
    }

    public void setLeft(AbstractExpression left) {
        this.left = left;
    }

    public AbstractExpression getRight() {
        return right;
    }

    public void setRight(AbstractExpression right) {
        this.right = right;
    }

    public String interpret() {
        return left.interpret() + " 再" + right.interpret();
    }
}
