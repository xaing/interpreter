package com.huntkey.test.pattern.interpreter.control;

/**
 * Created by lulx on 2017/9/4 0004 下午 2:46
 */
public class DirectionExpression extends AbstractExpression {

    private String direction;

    public DirectionExpression(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String interpret() {
        if(direction.equalsIgnoreCase("up")) {
            return " 向上";
        } else if(direction.equalsIgnoreCase("down")) {
            return " 向下";
        } else if(direction.equalsIgnoreCase("left")) {
            return " 向左";
        } else if(direction.equalsIgnoreCase("right")) {
            return " 向右";
        } else {
            return " 无效指令";
        }
    }
}
