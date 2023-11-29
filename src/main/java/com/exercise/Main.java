package com.exercise;

public class Main {

    public static void main(String[] args) {
        VowelCounter counter = new VowelCounter();
        var result = counter.getVolConListWithCount(args);
        System.out.println(result);
    }
}
