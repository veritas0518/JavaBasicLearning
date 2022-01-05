package com.javaBase.Day25.Evening;

/**
 *   如何自定义异常类？
 *        1.继承于现有的异常结构：RunTimeException 、 Exception
 *        2.提供全局常量 ： serialVersionUID
 *        3.提供重载的构造器
 */
public class MyException extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;

    public MyException(){

    }

        public MyException(String msg){
        super(msg);
        }


}
