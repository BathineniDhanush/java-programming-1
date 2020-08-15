//Q.2: Create two classes:
//BaseClass
//The Rectangle class should have two data fields-width and height of int types. The class
//should have display() method, to print the width and height of the rectangle separated
//by space.
//DerivedClass
//The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of
//Rectangle class.The class should have read_input() method, to read the values of width
//and height of the rectangle. The class should also overload the display() method to print
//the area (width*height) of the rectangle.
//Input Format
//The first and only line of input contains two space separated integers denoting the
//width and
//height of the rectangle.
//
//Constraints
//1 <= width, height <= 10^3
//Output Format
//The output should consist of:
//Print the width and height of the rectangle.
//In the second line, print the area of the rectangle.
package com.example;
import java.util.Scanner;
class Rectangle{public int width=10,height=20;
void Display(){

    System.out.println(width+" "+height);
}}
class RectangleArea extends Rectangle{
    public int height1,width1;
    public void read_input() {
      Scanner sc = new Scanner(System.in);
      String i[] = sc.nextLine().split(" ");
      width1 = Integer.parseInt(i[0]);
      height1 = Integer.parseInt(i[1]);
  }
  @Override
  void Display() {
this.width1=width1;
      this.height1=height1;
      System.out.println("Area is:"+width1*height1);
  }
}

public class QuestionTwo {
    public static void main(String[] args) {
  RectangleArea r=new RectangleArea();
  r.read_input();
  r.Display();
    }
}
