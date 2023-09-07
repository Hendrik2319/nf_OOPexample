package org.example.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 5, 8, 2, 5, 3, 9, 5, 6);

        showStream( list.stream().filter(n -> n%2 == 0 ) );
        showStream( list.stream().map(n -> n*2 ) );
        showStream( list.stream().sorted() );
        System.out.println("sum: "+ list.stream().reduce(0, Integer::sum) );

        list.stream()
                .filter(n -> n%2 == 0 )
                .map(n -> n*2 )
                .sorted()
                .forEach(System.out::println);

        System.out.println( list.stream().sorted().collect(Collectors.toList()) );



    }

    private static void showStream(Stream<Integer> stream1) {
        System.out.println( stream1
                .map(Object::toString)
                .collect(Collectors.joining(", "))
        );
    }

}
