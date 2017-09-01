package com.huntkey.test.pattern.interpreter.cal;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by lulx on 2017/9/1 0001 上午 9:24
 */
public class Calculator {

    private Expression expression;

    public Calculator(String expStr) {
        Stack<Expression> stack = new Stack<Expression>();

        char[] charArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;

        for(int i=0; i<charArray.length; i++){
            switch (charArray[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        return this.expression.interpreter(var);
    }

    public static void main(String[] args) {
        String expStr = "a+b-c";
        HashMap<String,Integer> var = new HashMap<String, Integer>();
        var.put("a",1);
        var.put("b",2);
        var.put("c",3);
        Calculator calculator = new Calculator(expStr);
        int run = calculator.run(var);
        System.out.println(run);
    }
}
