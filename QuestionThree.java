//Q.3: Write a program, creating an Employee class containing details of empId, empName,
//empDesignation, empSalary and empLocation. Create necessary methods like getters, setters
//and toString. Create 10 instances of the same.
//The problem is to generate stream of all the instances and do the following operations:
//a. Print the name of all the employees.
//b. Print all the salaries which are greater than 50,000/-
//c. Print all the locations starting with the letter ‘M’
//d. Print all the designations ending with ‘E’
package com.example;
import java.util.*;

class Employee{
    int empId,empSalary;
    String empName,empDesignation,empLocation;
    public Employee(int empId,String empName,String empDesignation,int empSalary,String empLocation){
        this.empId=empId;
        this.empName=empName;
        this.empDesignation=empDesignation;
        this.empSalary=empSalary;
        this.empLocation=empLocation;
    }

    // Getters and Setters

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empSalary=" + empSalary +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}
public class QuestionThree {
    public static void main(String[] args) {
     List<Employee> employeeList= Arrays.asList(new Employee(1,"Adi","Programmer",20000,"Mumbai"),
             new Employee(2,"Ashu","Programmer",240000,"Maldives"),
             new Employee(3,"Baadshah","Developer",30000,"Hyderabad"),
             new Employee(4,"Baazigar","Sr.Developer",80000,"Chennai"),
             new Employee(5,"Rahul","jr.employee",20000,"Macaw"),
             new Employee(6,"Vicky Malhotra","Manager",90000,"Hyderabad"),
             new Employee(7,"Black Panther","King",100000,"Wakanda"),
             new Employee(8,"Eric Killmonger","villain",25000,"Wakanda"),
             new Employee(9,"Thor","God of Thunder",10000,"Asgard"),
             new Employee(10,"Tony Stark","C.E.O",150000,"Newyork")
             );
        System.out.println("Print the name of all the employees.");
        employeeList.stream().forEach(e -> System.out.println(e.getEmpName()));
        System.out.println("Print all the salaries which are greater than 50,000");
        employeeList.stream().filter(e->e.getEmpSalary()>50000).forEach(e-> System.out.println(e.getEmpSalary()));
        System.out.println("Print all the locations starting with the letter ‘M’");
        employeeList.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e-> System.out.println(e.getEmpLocation()));
        System.out.println("Print all the designations ending with ‘E’");
        employeeList.stream().filter(e->e.getEmpDesignation().endsWith("e")).forEach(e-> System.out.println(e.getEmpDesignation()));
    }
}
