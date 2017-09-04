package com.huntkey.test.pattern.interpreter.control;

/**
 * Created by lulx on 2017/9/4 0004 下午 2:48
 */
public class ActionExpression extends AbstractExpression {

    private String action;

    public ActionExpression(String action) {
        this.action = action;
    }

    public String interpret() {
        if("move".equalsIgnoreCase(action)) {
            return " 移动 ";
        } else if("run".equalsIgnoreCase(action)) {
            return " 快速移动 ";
        } else {
            return " 无效指令";
        }
    }
}
