package com.javaBase.day18;

/**
 * @Descripton:
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 21:13 2021/7/5
 */
public class GeometricObject {
    protected String colour;
    protected double weight;
    protected GeometricObject(){

    }
    protected GeometricObject(String colour,double weight){
        this.colour = colour;
        this.weight=weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double findArea(){
        return 0.0;
    }
}
