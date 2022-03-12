package com.dataStructures.stack;

/**
 * @ClassName: Calculator
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2022/1/24 20:26
 **/

public class Calculator {
    public static void main(String[] args) {

        String expression = "1-6-2-4-4-2+1";
        //创建两个栈，一个是数栈，一个是符号栈
        ArrayStack2 numberStack = new ArrayStack2(10);
        ArrayStack2 operationStack = new ArrayStack2(10);
        //定义需要的相关变量
        int index = 0; //用于扫描表达式
        int number1, number2;
        int operation = 0;
        int result;
        char ch = ' '; //将每次扫描得到的char保存到ch中
        String keepNum = ""; //用于拼接多位数
        while (true) {
            //依此得到expression的每一个字符
            ch = expression.substring(index, index + 1).charAt(0);
            if (operationStack.isOperation(ch)) { //如果是运算符
                if (!operationStack.isEmpty()) {
                    //如果符号栈有操作符，就进行比较，如果当前的操作符的优先级小于或者等于栈中的操作符
                    if (operationStack.priority(ch) <= operationStack.priority(operationStack.peek())) {
                        //数栈中弹出两个数字
                        number1 = numberStack.pop();
                        number2 = numberStack.pop();
                        //符号栈中弹出一个操作符
                        operation = operationStack.pop();
                        //计算出结果
                        result = numberStack.cal(number1, number2, operation);
                        //再将得出的结果入数栈
                        numberStack.push(result);
                        //再把当前的操作符也入符号栈
                        operationStack.push(ch);
                    } else {
                        //如果当前的操作符的优先级大于栈中的操作符
                        operationStack.push(ch);
                    }
                } else {
                    operationStack.push(ch); //如果为空，直接入符号栈
                }
            } else { //如果是数字，直接入数栈
                //1.当处理多位数时，不能发现是一个数就立即入栈，因为它可能是多位数
                //2.在处理数字时，需要向expression的表达式的index后再看一位，如果是数字就进行扫描，如果是符号才入栈
                //3.因此我们需要定义一个变量字符串，用于拼接
                keepNum += ch;

                //如果ch已经是expression的最后一位了，就直接入栈
                if (index == expression.length() - 1) {
                    numberStack.push(Integer.parseInt(keepNum));
                } else {
                    //判断下一个字符是不是数字
                    if (operationStack.isOperation(expression.substring(index + 1, index + 2).charAt(0))) {
                        //如果后一位是运算符，则入栈
                        numberStack.push(Integer.parseInt(keepNum));
                        //重要的！！!!keepNum要清空,不然就保持上一次的值了
                        keepNum = "";
                    }
                }
            }

            //让index加1，并判断是否扫描到expression的最后
            index++;
            if (index >= expression.length()) {
                break;
            }
        }

        //当表达式扫描完毕，就顺序的从数栈和符号栈pop出相应的数和符号，并运行
        while (true) {
            //如果符号栈为空，则计算到最后了，数栈中只有一个数字了
            if (operationStack.isEmpty()) {
                break;
            }
            number1 = numberStack.pop();
            number2 = numberStack.pop();
            operation = operationStack.pop();
            result = numberStack.cal(number1, number2, operation);
            numberStack.push(result);
        }
        //将数栈的最后数，pop出，就是结果
        System.out.printf("表达式 %s = %d", expression, numberStack.pop());
    }
}

//先创建一个栈，但需要扩展功能
class ArrayStack2 {
    private int maxSize; //栈的大小
    private int[] stack; //数组模拟栈，数据放在该数组中
    private int top = -1; //top表示栈顶

    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    //返回当前栈顶的值，但不是真正的出栈
    public int peek() {
        return stack[top];
    }

    //栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void push(int value) {
        //先判断栈是否满
        if (isFull()) {
            System.out.println("栈满！不能入栈");
            return;
        }
        top++;
        stack[top] = value;
    }

    //出栈，将栈顶的数据返回
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空！不能出栈");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //显示栈的情况[遍历栈]，遍历时需要从栈顶开始显示数据
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空！无法遍历数据");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d] = [%d]\n", i, stack[i]);
        }
    }

    //返回运算符的优先级，优先级是程序员来确定的，优先级使用数字表示，数字越大，优先级越高
    public int priority(int operation) {
        if (operation == '*' || operation == '/') {
            return 1;
        } else if (operation == '+' || operation == '-') {
            return 0;
        } else {
            return -1; //假定目前的运算符只有加减乘除
        }
    }

    //判断是不是一个运算符
    public boolean isOperation(char value) {
        return value == '+' || value == '-' || value == '*' || value == '/';
    }

    //计算方法
    public int cal(int number1, int number2, int operation) {
        int res = 0; //用于存放计算的结果
        switch (operation) {
            case '+':
                res = number1 + number2;
                break;
            case '-':
                res = number2 - number1;
                break;
            case '*':
                res = number1 * number2;
                break;
            case '/':
                res = number2 / number1;
                break;
        }
        return res;
    }
}
