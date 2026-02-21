package com.example.collections;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}


public class ForEachExample {
    public static  void main(String[] args){
        //Using forEach, print only the numbers greater than 25.

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        numbers.forEach(num->{
            if(num>25){
                System.out.println(num);
            }
        });

        // Print names starting with A
        List<String> names = List.of("Amlan", "Rahul", "Riya", "Ankit", "Bob");
        names.forEach(name->{if(name.startsWith("A"))System.out.println(name);});

        // Calculate the sum
        AtomicInteger sum = new AtomicInteger(0);
        numbers.forEach(num->sum.addAndGet(num));
        System.out.println(sum);

        // Print name of employees whose salary is greater than 60000
        List<Employee> employees = List.of(
                new Employee("Amlan", 50000),
                new Employee("Rahul", 70000),
                new Employee("Riya", 40000),
                new Employee("Ankit", 80000)
        );
        employees.forEach(emp->{
            if(emp.salary>60000){
                System.out.println(emp.name);
            }
        });

        //Print each word in uppercase, but do NOT modify the original list.
        List<String> words = List.of("java", "lambda", "stream", "code");
        words.forEach(word-> System.out.println(word.toUpperCase()));
    }
}