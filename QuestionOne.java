//Design a Calculator class which contains four lambda methods:
//
//a. add(a, b)
//b. difference(a, b)
//c. product(a, b)
//d. safeDivision(a, b)
//Also design the main methods which pass actual parameters to test the Calculator class.
package com.example;
interface Addable{public int add(int a,int b);}
interface Sub{public int difference(int a,int b);}
interface Mul{public int product(int a,int b);}
interface div{public int safeDivision(int a,int b);}
public class QuestionOne {
    public static void main(String[] args)
    {
      int a=20,b=10;
      Addable A=(a1, b1) ->{return a1+b1;};
      Sub S=(a1, b1) -> {return a1-b1;};
      Mul M=(a1, b1) -> {return a1*b1;};
      div D=(a1, b1) -> {if(b1==0)
          return 0;
      return a1/b1;};
        System.out.println("The sum is:"+A.add(a,b));
        System.out.println("The difference is:"+S.difference(a,b));
        System.out.println("The product is:"+M.product(a,b));
        System.out.println("The quotient is:"+D.safeDivision(a,b));

    }

}

