package com.dataStructures.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: PolandNotation
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2022/1/25 21:50
 **/

public class PolandNotation {
    public static void main(String[] args) {

        //完成将中缀表达式转换成后缀表达式的功能
        //1.直接对一个字符串操作不太方便，因此先将该字符串转成中缀表达式对应的list
        //2。将得到的终中缀表达式对应的list --> 后缀表达式对应的list

        String expression = "1+((2+3)*4)-5";
        List<String> infixExpression = toInfixExpression(expression);
        System.out.println("中缀表达式对应的list:"+infixExpression);
        List<String> suffixExpressionList = parseSuffixExpressionList(infixExpression);
        System.out.println("后缀表达式对应的list:"+suffixExpressionList);
        System.out.println("expression = "+calculate(suffixExpressionList));

        //先定义一个逆波兰表达式
        String suffixExpression = "4 5 * 8 - 60 + 8 2 / +";
        //1.先将表达式放在ArrayList中
        //2.将ArrayList传递给一个方法，遍历ArrayList配合栈，完成计算

        List<String> rpnList = getListString(suffixExpression);
        System.out.println("rpnList = " + rpnList);

        int res = calculate(rpnList);
        System.out.println("res = " + res);
    }

    public static List<String> parseSuffixExpressionList(List<String> ls) {
        //定义两个栈
        Stack<String> operationStack = new Stack<>(); //符号栈
        //因为s2这个栈，在整个转换过程中，没有pop操作，而且后面我们还需要逆序输出，因此比较麻烦，直接使用List<String>
        List<String> list = new ArrayList<>(); //用于存储中间结果的list

        //遍历ls
        for (String item : ls) {
            //如果是一个数，就直接入栈
            if (item.matches("\\d+")) {
                list.add(item);
            } else if (item.equals("(")) {
                operationStack.push(item);
            } else if (item.equals(")")) {
                //如果是右括号，则依次弹出operationStack栈顶的运算符，并压入list,直到遇到左括号为止，此时将这一对括号丢弃
                while (!operationStack.peek().equals("(")) {
                    list.add(operationStack.pop());
                }
                operationStack.pop(); //将 ( 弹出，消除小括号
            } else {
                //当item的优先级小于等于operationStack栈顶的运算符的优先级，就将栈中的运算符弹出并压入list
                while (operationStack.size() != 0 && Operation.getValue(operationStack.peek()) >= Operation.getValue(item)) {
                    list.add(operationStack.pop());
                }
                //还需要将item压入operationStack
                operationStack.push(item);
            }
        }
        //将operationStack中剩余的运算符压入list中
        while (operationStack.size() != 0) {
            list.add(operationStack.pop());
        }
        return list; //因为是存放到List，因此按顺序输出就是对应的逆波兰表达式
    }

    //将中缀表达式转成对应的List
    public static List<String> toInfixExpression(String s) {
        List<String> list = new ArrayList<>();
        int i = 0; //指针，用于遍历中缀表达式字符串
        String str; //做多位数的拼接
        char c; //每遍历到一个字符，就放入c
        while (i < s.length()) {
            //如果c是一个非数字，就需要加入到list中去
            if ((c = s.charAt(i)) < 48 || (c = s.charAt(i)) > 57) {
                list.add("" + c);
                i++;
            } else { //如果是一个数，需要考虑多位数的问题
                str = ""; //先将str置成空串 '0'[48] --> '9'[57]
                while (i < s.length() && (c = s.charAt(i)) >= 48 && (c = s.charAt(i)) <= 57) {
                    str += c; //拼接
                    i++;
                }
                list.add(str);
            }
        }
        return list;
    }

    //将一个逆波兰表达式，依次将数据和运算符放入到ArrayList中
    public static List<String> getListString(String suffixString) {
        //将suffixString分割
        String[] split = suffixString.split(" ");
        List<String> list = new ArrayList<>();
        for (String ele : split) {
            list.add(ele);
        }
        return list;
    }

    //完成对逆波兰表达式的运算
    public static int calculate(List<String> ls) {
        //只需要一个栈即可
        Stack<String> stack = new Stack<>();
        //遍历list
        for (String item : ls) {
            //这里使用正则表达式来取出数
            if (item.matches("\\d+")) { //匹配的是多位数
                stack.push(item);
            } else {
                //pop出两个数并运算，再入栈
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num2 + num1;
                } else if (item.equals("-")) {
                    res = num2 - num1;
                } else if (item.equals("*")) {
                    res = num2 * num1;
                } else if (item.equals("/")) {
                    res = num2 / num1;
                } else {
                    throw new RuntimeException("运算符有误");
                }
                //把结果入栈
                stack.push(String.valueOf(res));
            }
        }
        //最后留在stack中的是运算符
        return Integer.parseInt(stack.pop());
    }
}

//编写一个类 Operation 可以返回一个运算符对应的优先级
class Operation {
    private static int ADD = 1;
    private static int SUB = 1;
    private static int MYL = 2;
    private static int DIV = 2;

    //写一个方法，返回对应的优先级数字
    public static int getValue(String operation) {
        int result = 0;
        switch (operation) {
            case "+":
                result = ADD;
                break;
            case "-":
                result = SUB;
                break;
            case "*":
                result = MYL;
                break;
            case "/":
                result = DIV;
                break;
            default:
                System.out.println("不存在该运算符");
                break;
        }
        return result;
    }
}
