//Write a program, creating a Triangle class which contains a method that takes three
//parameters of the three sides of the triangle, ‘a’, ‘b’, ‘c’, and returns you with the area of the
//triangle and print it.
package com.example;
import java.math.*;
import java.util.Scanner;

class Triangle{
    int a,b,c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(int a,int b,int c){
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
            int s=(a+b+c)/2;
            double  ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return ar;
        }
        else
           return 0;}
}

public class QuestionSeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first side:");
        int a= scanner.nextInt();
        System.out.print("Enter Second side:");
        int b=scanner.nextInt();
        System.out.print("Enter third side:");
        int c= scanner.nextInt();
        Triangle t=new Triangle(a,b,c);
        System.out.println("Area is:"+t.area(a,b,c));

    }
}
