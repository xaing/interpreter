package com.huntkey.test.pattern.interpreter.convertor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lulx on 2017/9/1 0001 下午 4:20
 */
public class WanExpression extends Expression{
    public String getPostfix() {
        return "万";
    }

    public int multiplier() {
        return 10000;
    }

    public void interpret(Context context)
    {
        if(context.getStatement().length() == 0)
            return ;

        if (stringEndWith(context.getStatement(),getPostfix())){
            List<Expression> exps = new ArrayList<Expression>();
            exps.add(new GeExpression());
            exps.add(new ShiExpression());
            exps.add(new BaiExpression());
            exps.add(new QianExpression());

            int temp = context.getData();
            String sm = context.getStatement();
            context.setData(0);
            context.setStatement(sm.substring(0, sm.length()-1));

            Iterator<Expression> iterator = exps.iterator();

            while (iterator.hasNext()) {
                iterator.next().interpret(context);
            }
            context.setData(temp + multiplier()* context.getData());
        }
    }
}
