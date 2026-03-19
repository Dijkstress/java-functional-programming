package com.example.collections;

import java.util.Comparator;
import java.util.List;

public class SortedExample {

    public static void main (String[] args){
        List<Integer> numbers = List.of(9,3,7,1,5);
        List<Integer> sorted = numbers.stream()
                .sorted().toList();
        System.out.println(sorted);

        List<Product> products = List.of(
                new Product("Laptop", 75000),
                new Product("Phone", 50000),
                new Product("Tablet", 30000)
        );

        // sort based on price
        List<Product> sortedByPrice = products.stream()
                .sorted((a,b)-> Double.compare(a.price,b.price))
                .toList();
        sortedByPrice.forEach(product -> System.out.println(product.price));

        // sort by name
         List<Product> sortByName = products.stream()
                 .sorted((a,b)->a.name.compareTo(b.name))
                 .toList();
         sortByName.forEach(item->System.out.println(item.name));

         // descending
        products.stream()
                .sorted(Comparator.comparingDouble((Product p) -> p.price).thenComparing(p->p.name))
                .map(item->item.price + ":" +item.name)
                .forEach(System.out::println);

        //price ascending
        //name descending
        products.stream()
                .sorted(Comparator.comparingDouble((Product p)->p.price).reversed().thenComparing(p->p.name))
                .map(item->item.price+":"+item.name)
                .forEach(System.out::println);
    }

}
