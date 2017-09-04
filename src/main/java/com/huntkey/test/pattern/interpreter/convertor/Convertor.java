package com.huntkey.test.pattern.interpreter.convertor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lulx on 2017/9/1 0001 下午 4:41
 */
public class Convertor {

    private Context context;
    private String chineseNum;
    private int result;
    private List<Expression> exps;

    public Convertor() {
        reset();
    }

    private void reset() {
        context = new Context(chineseNum);
        exps = new ArrayList<Expression>();
        context.setStatement(chineseNum);
        context.setData(0);
        exps.clear();
    }

    public Convertor(String chineseNum) {
        this.chineseNum = chineseNum;
        result = 0;
    }

    public void convert() {
        reset();
        exps.add(new GeExpression());
        exps.add(new ShiExpression());
        exps.add(new BaiExpression());
        exps.add(new QianExpression());
        exps.add(new WanExpression());

        Iterator<Expression> iterator = exps.iterator();
        while (iterator.hasNext()) {
            Expression expression = iterator.next();
            expression.interpret(context);
        }
        result = context.getData();
    }

    public int getRoman() {
        return result;
    }

    public void setChineseNum(String chineseNum) {
        this.chineseNum = chineseNum;
    }

}
