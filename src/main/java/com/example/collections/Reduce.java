package com.example.collections;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args){
        // product of all numbers
        List<Integer> numbers = List.of(2, 3, 4, 5);
        int product=numbers.stream()
                .reduce(1,(accumulator,currValue)->accumulator*currValue);
        System.out.println(product);

        // maximum number
        int maxNum = numbers.stream()
                .reduce(-1,(accumulator,currValue)-> accumulator>currValue?accumulator:currValue);
        System.out.println(maxNum);

        // sum of even numbers
        int sumOfEven = numbers.stream()
                .reduce(0,(acc,curr)->!(curr%2==0)?acc:curr+acc);
        System.out.println(sumOfEven);

        // longest string in the list
        List<String> words = List.of("Java", "Collections", "Stream", "Lambda", "API");
        String longest = words.stream()
                .reduce("",(acc,curr)->curr.length()>acc.length()?curr:acc);
        System.out.println(longest);

        // total length
        int totalLength = words.stream()
                .reduce(0,
                        (acc,curr)->acc+curr.length(),
                        Integer::sum
                );
        System.out.println(totalLength);
    }
}
