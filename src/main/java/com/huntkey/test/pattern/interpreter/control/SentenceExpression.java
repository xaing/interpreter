package com.huntkey.test.pattern.interpreter.control;

/**
 * Created by lulx on 2017/9/4 0004 下午 2:41
 */
public class SentenceExpression extends AbstractExpression {

    private AbstractExpression direction;
    private AbstractExpression action;
    private AbstractExpression distance;

    public SentenceExpression(AbstractExpression direction, AbstractExpression action, AbstractExpression distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    public AbstractExpression getDirection() {
        return direction;
    }

    public void setDirection(AbstractExpression direction) {
        this.direction = direction;
    }

    public AbstractExpression getAction() {
        return action;
    }

    public void setAction(AbstractExpression action) {
        this.action = action;
    }

    public AbstractExpression getDistance() {
        return distance;
    }

    public void setDistance(AbstractExpression distance) {
        this.distance = distance;
    }

    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
