package com.huntkey.test.pattern.interpreter.control;

/**
 * Created by lulx on 2017/9/4 0004 下午 2:49
 */
public class DistanceExpression extends AbstractExpression {

    private String distance;

    public DistanceExpression(String distance) {
        this.distance = distance;
    }

    public String interpret() {
        return distance;
    }
}
