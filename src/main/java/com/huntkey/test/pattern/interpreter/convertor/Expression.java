package com.huntkey.test.pattern.interpreter.convertor;

import com.sun.org.apache.bcel.internal.generic.TABLESWITCH;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by lulx on 2017/9/1 0001 上午 10:51
 */
public abstract class Expression {

    protected static Map<String, Integer> table;

    static {
        table = new HashMap<String, Integer>();
        table.put("一",1);
        table.put("二",2);
        table.put("三",3);
        table.put("四",4);
        table.put("五",5);
        table.put("六",6);
        table.put("七",7);
        table.put("八",8);
        table.put("九",9);
    }

    public Boolean stringEndWith(String src, String tail){
        if(src.length() < tail.length())
            return false;
        String tem = src.substring(src.length() - tail.length());
        return 0 == tem.compareTo(tail);
    };

    public void interpret(Context context){
        if(context.getStatement().length() == 0)
            return;
        Set<Map.Entry<String, Integer>> entries = table.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            String statement = context.getStatement();
            Map.Entry<String, Integer> next = iterator.next();
            String tail = next.getKey() + getPostfix();
            int val = next.getValue();
            if(stringEndWith(statement, tail)){
                context.setData(context.getData() + multiplier() * val);
                context.setStatement(statement.substring(0, statement.length() - 1 - getPostfix().length()));
                break;
            }
            if(stringEndWith(statement, "零")){
                //”零“则直接跳过
                context.setStatement(statement.substring(0, statement.length() - 1));
                break;
            }
        }
    };

    // 表达式的后缀 （十、百..）
    public abstract String getPostfix();

    // 表达式的数量级
    public abstract int multiplier();
}
