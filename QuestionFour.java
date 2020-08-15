//A class called circle is designed as shown in the following class diagram. It contains:
//• Two private instance variables: radius (of the type double) and color (of the type
//String), with default value of 1.0 and "red", respectively.
//• Two overloaded constructors - a default constructor with no argument, and a
//constructor which takes a double argument for radius.
//• Two public methods: getRadius() and getArea(), which return the radius and area of
//this instance, respectively.
package com.example;
class Circle{
    private double radius=1.0;
    private String color="red";
    public void Circle(){

    }
    public void Circle(double radius)
    {
        this.radius=radius;
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius*3.14*radius;
    }
}
public class QuestionFour {
    public static void main(String[] args) {
        Circle c=new Circle();
        System.out.println("Radius is:"+c.getRadius());
        System.out.println("Area is:"+c.getArea());
        }
}
