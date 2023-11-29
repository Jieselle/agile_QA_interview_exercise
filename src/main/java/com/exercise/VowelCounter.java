package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCounter {

    public List<CountResult> getVolConListWithCount(String[] args) {
        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
            return null;
        } else {
            List<String> argumentList = Arrays.asList(args);
            List<CountResult> vowelCount = new ArrayList<>();
            argumentList.forEach(argument -> vowelCount.add(new CountResult(argument, getVowelCount(argument),getConsonantCount(argument))));
            return vowelCount;
        }
    }

    private Integer getVowelCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[aeiou]")).count();
    }

    private Integer getConsonantCount(String input) {
        String[] inputChars = input.split("");
        return (int) Arrays.stream(inputChars).filter(inputChar -> inputChar.matches("[^(?!aeiou)a-z]")).count();
    }
}
