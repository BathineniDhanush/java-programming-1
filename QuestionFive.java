//Print the sum, difference and product of two complex numbers by creating a class named
//'Complex' with separate methods for each operation whose real and imaginary parts are
//entered by user.
package com.example;
import java.util.Scanner;
class Complex{
    double real;
    double imaginary;
    public Complex(){}
    public Complex(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }


}

public class QuestionFive {
    public static Complex difference(Complex a,Complex b){
        Complex temp=new Complex();
        temp.real=a.real-b.real;
        temp.imaginary=a.imaginary-b.imaginary;
        return temp;
    }
    public static Complex sum(Complex a, Complex b){
        Complex temp=new Complex(0.0,0.0);
        temp.real=a.real+b.real;
        temp.imaginary=a.imaginary+b.imaginary;
        return temp;
    }
    public static Complex multiplication(Complex a,Complex b){
        Complex temp=new Complex(0.0,0.0);
        temp.real= ((a.real*b.real)-(a.imaginary*b.imaginary));
        temp.imaginary=((a.real*b.imaginary)+(a.imaginary*b.real));
        return temp;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a1,i1;

        System.out.println("Enter real part of first number:");
        a1= scanner.nextDouble();
        System.out.println("Enter imaginary part of first number:");
        i1=scanner.nextDouble();
        System.out.println("Enter real part of second number:");
        double a2= scanner.nextDouble();
        System.out.println("Enter imaginary part of second number:");
        double i2=scanner.nextDouble();
        Complex c1=new Complex(a1,i1);

        Complex c2=new Complex(a2,i2);
        //Complex operations=new Complex();
        Complex sum=sum(c1,c2);
        Complex d=difference(c1,c2);
        Complex m=multiplication(c1,c2);
        System.out.println(sum.real+"+"+ sum.imaginary+"i");
        System.out.println(d.real+"+"+ d.imaginary+"i");
        System.out.println(m.real+"+"+m.imaginary+"i");

    }
}
