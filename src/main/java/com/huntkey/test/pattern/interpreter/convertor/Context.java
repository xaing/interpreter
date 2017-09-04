package com.huntkey.test.pattern.interpreter.convertor;

/**
 * Created by lulx on 2017/9/1 0001 上午 10:50
 */
public class Context {
    private String statement;
    private int data;

    public Context(String statement) {
        this.statement = statement;
        this.data = 0;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
