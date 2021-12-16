package com.javaBase.day18.evening;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 19:13 2021/7/6
 */
public class OrderTest {
    public static void main(String[] args) {
    Order o1 =new Order(new String("aa"),1001);
    Order o2 =new Order("aa",1001);
        System.out.println(o1.equals(o2));
    }
}
class Order{
    private  int orderId;
    private String orderName;
    public Order(){

    }
    public Order(String orderName,int orderId)
    {
        this.orderName=orderName;
        this.orderId = orderId;
    }
    public void setOrderId(int orderId){
        this.orderId =orderId;
    }
    public int getOrderId(){
        return orderId;
    }
    public void setOrderName(String orderName){
        this.orderName =orderName;
    }
    public String getOrderName(){
        return orderName;

    }
    public boolean equals(Object obj){
        if(obj ==this){
        return true;
        }
        if(obj instanceof Order){
            Order order =(Order)obj;
            if(order.orderId==this.orderId&&this.orderName.equals(order.orderName)){
                return true;
            }else
            return false;
        }
        return false;
    }

}