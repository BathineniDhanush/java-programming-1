//Write a program, creating a class containing the generic method which accepts only
//numbers, generating a custom exception when passed with the String value.
//The functionality of the generic method is to print the 2/3 of the passed value.
package com.example;
class MyException extends Exception{
    public MyException(String s) {
        super(s);
    }
}
class GenericsExample<T>{
    T obj;

    public GenericsExample(T obj) {
        this.obj = obj;
    }

    public int function(int obj){return (int)(0.667*obj); }
    public double function(double obj){return (double)((0.667)*obj); }
    public float function(float obj){return (float)(0.667*obj); }
    public void function(String obj){try{
        throw new MyException("You used a String");
    }catch(MyException ex){
        System.out.println("Exception caught because of string");

    }
    }

}
public class QuestionEight {
    public static void main(String[] args) {
     int a=3;
     float f=3.1f;
     double d=3.12545;
     String s="Strings";
     GenericsExample integerGenericsExample=new GenericsExample(a);
     GenericsExample floatGenericsExample=new GenericsExample(f);
     GenericsExample doubleGenericsExample=new GenericsExample(d);
     GenericsExample<String> stringGenericsExample=new GenericsExample(s);
        System.out.println("integer is:"+integerGenericsExample.function(a));
        System.out.println("Float is:"+floatGenericsExample.function(f));
        System.out.println("Double is:"+doubleGenericsExample.function(d));
     stringGenericsExample.function(s);
    }
    }
