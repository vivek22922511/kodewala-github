package com.practice.DSA_questions.FirstDay2;

import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {

        Set<Employee> employees=new HashSet<Employee>();

        Employee e1=new Employee("vivek",1234);
        Employee e2=new Employee("vivek",12345);
        System.out.println("e1="+e1.hashCode()+"e2="+e2.hashCode());
        System.out.println(e1.equals(e2));
        employees.add(e1);
        employees.add(e2);
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private  int id;

    public Employee(String _name,int _id){
        super();
        this.name=_name;
        this.id=_id;
    }
    @Override
    public int hashCode(){

        return this.name.hashCode() + this.id;

    }

    public boolean equals(Object obj){
        Employee emp=(Employee) obj;
        return this.name.equals(emp.name) & this.id== emp.id;
    }

}
