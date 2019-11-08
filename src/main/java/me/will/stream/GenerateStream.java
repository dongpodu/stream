package me.will.stream;

import com.sun.tools.javac.util.List;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateStream {

    public void test() throws FileNotFoundException {
        Stream.of(1, 2, 3);
        List.of(1, 2, 3).stream();
        List.of(1, 2, 3).parallelStream();
        Arrays.stream(new Integer[]{1, 2, 3});

        String path="";
        InputStreamReader reader = new InputStreamReader(new FileInputStream(new File(path)));
        BufferedReader bufferedReader = new BufferedReader(reader);
        bufferedReader.lines();
    }

    public static void test1() throws IOException {
//        IntStream.rangeClosed(1,10);
        Stream fileStream = Files.walk(Paths.get("/Users/duyisong/Documents"));
        System.out.println(fileStream.map(r ->r.toString()).collect(Collectors.toList()));
    }

    public static void test2(){
//        Spliterator spliterator= new Spliterator();
    }

    public static void main(String[] args) throws IOException {
        test1();
    }

}
