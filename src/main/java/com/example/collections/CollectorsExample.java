package com.example.collections;

import java.util.*;
import java.util.stream.*;

public class CollectorsExample {

    public static void main(String[] args){

        // create a list of event numbers
        List<Integer> numbers = List.of(3, 7, 10, 12, 15, 18);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num->num%2==0)
                .toList();
        System.out.println(evenNumbers);

        // set of names start with A
        List<String> names = List.of("Amlan", "Rahul", "Ankit", "Riya", "Arjun");
        Set<String> setOfNames=names.stream().filter(name->name.startsWith("A")).collect(Collectors.toSet());
        System.out.println(setOfNames);

        // {word,length}
        List<String> words = List.of("java", "stream", "lambda", "api");
        Map<String, Integer> map = words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        String::length
                ));

        System.out.println(map);

        // list of word length
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .toList();
        System.out.println(wordLengths);

        // map first letter with words
        //{
        // A=[Amlan, Ankit, Arjun],
        // R=[Rahul, Riya]
        //}

        Map<Character,List<String>> listMap = names.stream()
                .collect(Collectors.groupingBy(
                        name->name.charAt(0)
                ));
        System.out.println(listMap);
    }
}
