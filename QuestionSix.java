//Write a program, creating a class which contains a method that would print the
//information (name, year of joining, salary, address) of three employees by creating a class
//named 'Employee'. The output should be as follows:
//
//Name Year of joining Address
//Robert 1994 64C- WallStreet
//Sam 2000 68D- WallStreet
//John 1999 26B- WallStreet
package com.example;
import java.util.*;
class Employees{
    String empName,empAddress;
    int empJoin,empSalary;

    public Employees(String empName,int empJoin, int empSalary, String empAddress) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.empJoin = empJoin;
        this.empSalary = empSalary;
    }


}

public class QuestionSix {
    public static void main(String[] args) {
        List<Employees>employees=Arrays.asList(new Employees("Robert",1994,64000,"64C-Wall Street"),
                new Employees("Sam",2000,65000,"68D-Wall Street"),
                new Employees("John",1999,25000,"26B- Wall Steet"));
        System.out.println("Name||Year of joining||salary||Address");
        for(Employees e:employees){
            System.out.println(e.empName+"||"+e.empJoin+"||"+e.empSalary+"||"+e.empAddress);}
    }
}
