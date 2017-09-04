package com.huntkey.test.pattern.interpreter.control;

/**
 * Created by lulx on 2017/9/4 0004 下午 3:16
 */
public class TestControl {
    public static void main(String[] args) {
        InstructionHandler handler = new InstructionHandler();

        String instruction = "up move 5 and down run 10 and left move 5";
        handler.handle(instruction);
        System.out.println(instruction + " || " + handler.output());

        instruction = "right run 20 and down move 10 and left run 40 and up run 10";
        handler.handle(instruction);
        System.out.println(instruction + " || " + handler.output());
    }
}
