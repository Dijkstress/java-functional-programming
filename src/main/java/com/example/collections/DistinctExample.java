package com.example.collections;

import java.util.List;

public class DistinctExample {

    public static void main(String[] args){
        // list unique numbers
        List<Integer> numbers = List.of(1,2,2,3,4,4,5,5,5);
        List<Integer> uniqueNumbers=numbers.stream().distinct().toList();
        System.out.println(uniqueNumbers);

        // list unique names
        List<String> names = List.of(
                "Amlan","Rahul","Amlan","Riya","Rahul","Ankit"
        );
        List<String> uniqueNames = names.stream()
                .distinct().toList();
        System.out.println(uniqueNames);
    }

}
