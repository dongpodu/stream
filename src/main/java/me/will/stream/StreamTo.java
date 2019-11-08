package me.will.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTo {

    public static void test(){
        IntStream stream = IntStream.rangeClosed(1,10);
        System.out.println(stream.toArray());
    }

    public static void test1(){
        Stream<Integer> stream = Arrays.stream(new Integer[]{1,2,3,4});
        List<Integer> list = stream.collect(Collectors.toList());
        System.out.println(list);
    }

    public static void test2(){
        Stream<String> stream = Arrays.stream(new String[]{"1","2","3","4"});
        String str = stream.collect(Collectors.joining(":"));
        System.out.println(str);
    }

    public static void main(String[] args) {
        test2();
    }
}
