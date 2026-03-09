package com.example.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

    public static void main(String[] args){
        // print all names
        List<List<String>> names = List.of(
                List.of("Amlan", "Rahul"),
                List.of("Ankit", "Riya"),
                List.of("Arjun")
        );

        names.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        List<List<Integer>> numbers = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );
        List<Integer> numbersCollection=numbers.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(numbersCollection);
    //Create a List of all words.
        List<String> sentences = List.of(
                "Java is powerful",
                "Streams are useful",
                "Practice makes perfect"
        );
        List<String> listOfSentences = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .toList();
        System.out.println(listOfSentences);

        // Create a List containing only names starting with "A".
        List<String> onlyAs=names.stream()
                .flatMap(List::stream)
                .filter(name->name.startsWith("A"))
                .toList();
        System.out.println(onlyAs);

        //list of all characters
        List<String> words = List.of("Java", "Stream");
        List<String> chars = words.stream()
                .flatMap(word->Arrays.stream(word.split("")))
                .toList();
        System.out.println(chars);
    }

}
