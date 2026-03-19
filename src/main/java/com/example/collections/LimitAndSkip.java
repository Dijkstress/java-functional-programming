package com.example.collections;

import java.util.*;
import java.util.stream.IntStream;

public class LimitAndSkip {

    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(5, 12, 18, 7, 20, 3, 25, 10);
        nums.stream().skip(2).limit(3).forEach(System.out::println);

        List<Integer> filterdNums=nums.stream().filter(item->item>10).skip(1).limit(2).toList();
        System.out.println(filterdNums);

        List<String> names = Arrays.asList("A", "B", "C");
        List<String> newNames=names.stream().skip(5).toList();
        System.out.println(newNames);

        List<Integer> pages = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        pages.stream().skip(3).limit(3).toList().forEach(System.out::println);

        List<Integer> numbers = IntStream.rangeClosed(1, 100).boxed().toList();
        numbers.stream().skip(10).filter(num->num%2==0).limit(5).forEach(System.out::println);
    }

}
