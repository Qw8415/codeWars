package kyu4;

import java.util.Stack;

public class BefungeInterpreter {
    private char directory = '>';
    private Stack<Integer> stack = new Stack<>();
    private int xIndex = 0;
    private int yIndex = 0;

    public String interpret(String code) {
        String[] multiLineCode = code.split("\n");
        return "";
    }

    private void moveCursor() {
        switch (directory) {
            case '>':
                xIndex++;
                break;
            case '<':
                xIndex--;
                break;
            case '^':
                yIndex++;
                break;
            case 'v' :
                yIndex--;
                break;
        }
    }


}
