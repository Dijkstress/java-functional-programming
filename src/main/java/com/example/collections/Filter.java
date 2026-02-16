package com.example.collections;

import java.util.List;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Filter {


    public static void main(String[] args){
        //    print only the numbers divisible by 5.
        List<Integer> numbers = List.of(3, 7, 10, 15, 20, 25);
        numbers.stream()
                .filter(item->item%5==0)
                .forEach(System.out::println);

        // names start with A and length>5
        List<String> names = List.of("Amlan", "Rahul", "Riya", "Ankit", "Bob", "Arjun");
        names.stream()
                .filter(item->item.startsWith("A") && item.length()>5)
                .forEach(System.out::println);

        // products with price>40,000
        List<Product> products = List.of(
                new Product("Laptop", 75000),
                new Product("Phone", 50000),
                new Product("Tablet", 30000),
                new Product("Monitor", 15000)
        );

        products.stream()
                .filter(item->item.price>40000)
                .forEach(filteredItem->System.out.println(filteredItem.name));

        // Not divisible by 3
        numbers.stream()
                .filter(item->(item%3!=0))
                .forEach(System.out::println);

        // words with len>4 and "a" case-insensitive
        List<String> words = List.of("Java", "Stream", "Code", "Lambda", "AI", "ChatGPT");
        words.stream()
                .filter(item->item.toLowerCase().contains("a")  && item.length()>4 )
                .forEach(System.out::println);
    }

}
