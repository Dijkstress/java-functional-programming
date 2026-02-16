package com.example.collections;

import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Map {
    public static void main(String[] args){
        // print each number multiplied by 3
        List<Integer> numbers = List.of(5, 10, 15, 20);
        numbers.stream()
                .map(item->item*3)
                .forEach(System.out::println);

        // each name in uppercase
        List<String> names = List.of("amlan", "rahul", "riya", "ankit");
        names.stream()
                // .map(item->item.toUpperCase()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // only salaries of employees
        List<Employee> employees = List.of(
                new Employee("Amlan", 50000),
                new Employee("Rahul", 70000),
                new Employee("Riya", 40000)
        );
        employees.stream()
                .map(item->item.salary)
                .forEach(System.out::println);

        // convert them into numbers and square it
        List<String> stringNumbers = List.of("10", "20", "30", "40");
        stringNumbers.stream()
//                .map(item->Integer.parseInt(item) * Integer.parseInt(item))
                .map(Integer::parseInt)
                .map(item->item*item)
                .forEach(System.out::println);

        // Print each student's grade using this rule:
        //marks >= 75 → "Distinction"
        //marks >= 60 → "First Class"
        //otherwise → "Pass"
        List<Student> students = List.of(
                new Student("Amlan", 80),
                new Student("Rahul", 65),
                new Student("Riya", 90)
        );

        students.stream()
                .map(item->{
                    if(item.marks>=75){
                        return "Distinction";
                    }else if(item.marks>=60){
                        return "First Class";
                    }else{
                        return "Pass";
                    }
                })
                .forEach(System.out::println);
    }
}
