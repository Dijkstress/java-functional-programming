package com.example.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstAndFindAny {

    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(5, 10, 15, 20, 25);
        Optional<Integer> first = nums.stream().filter(num->num>10).findFirst();
        System.out.println(first.orElse(-1));
//        Use parallelStream()
//        Use findAny() for elements > 20
        Optional<Integer> result =  nums.parallelStream().filter(num->num>20).findAny();
        System.out.println(result.orElse(-1));
        Boolean isEven = nums.stream().anyMatch(num->num%2==0);
        System.out.println(isEven);
    }

}
