package com.huntkey.test.pattern.interpreter.control;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

/**
 * Created by lulx on 2017/9/4 0004 下午 2:52
 */
public class InstructionHandler {

    private AbstractExpression mExp;

    public void handle(String instruction){
        AbstractExpression left = null;
        AbstractExpression right = null;
        AbstractExpression direction = null;
        AbstractExpression action = null;
        AbstractExpression distance = null;

        //声明一个栈对象用于存储抽象语法树
        Stack<AbstractExpression> stkExp = new Stack<AbstractExpression>();
        Vector<String> words = new Vector(Arrays.asList(instruction.split(" ")));;
        String dir;
        String act;
        String dis;
        for(int i=0; i<words.size(); i++){
            //本实例采用栈的方式来处理指令，如果遇到and则将其后的三个单词连成一个简单句子（Sentence）
            //作为"and"的右表达式，而将栈顶弹出的表达式作为"and"的左表达式，最后将新的And表达式压入栈中
            dir = "";
            act = "";
            dis = "";
            if("and".equalsIgnoreCase(words.get(i))){
                //从弹出栈顶作为and的左表达式
                left = stkExp.pop();

                dir = words.get(++i);
                direction = new DirectionExpression(dir);
                act = words.get(++i);
                action = new ActionExpression(act);
                dis = words.get(++i);
                distance = new DistanceExpression(dis);

                //组成一个简单表达式作为And的右表达式
                right = new SentenceExpression(direction, action, distance);

                //生成And表达式，并压入栈中
                stkExp.push(new AndExpression(left, right));
            } else{
                //如果不是and表达式，就从头开始进行解释，将前3个单词作为Sentence
                //的三个操作数，生成简单表达式解析器后压入栈中
                dir = words.get(i);
                direction = new DirectionExpression(dir);
                act = words.get(++i);
                action = new ActionExpression(act);
                dis = words.get(++i);
                distance = new DistanceExpression(dis);

                //组成一个简单表达式作为And的右表达式
                stkExp.push(new SentenceExpression(direction, action, distance));
            }
        }
        if(!stkExp.empty()){
            mExp = stkExp.pop();
        } else
            mExp = null;
    }
    public String output(){
        return mExp==null ? "": mExp.interpret();
    }
}
