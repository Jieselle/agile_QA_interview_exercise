package com.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCounter {

    public List<CountResult> getLetterCount(String[] args) {


        if (args.length >= 4) {
            System.out.println("Extra arguments passed.");
            return null;
        } else {
            List<String> argumentList = Arrays.asList(args);
            List<CountResult> vowelCount = new ArrayList<>();
            argumentList.forEach(argument -> vowelCount.add(count(argument)));

            return vowelCount;
        }
    }
    public static CountResult count(String string)
    {
        int v;
        CountResult results = new CountResult(string);
        for (v=0;v<string.length();v++)
        {
            if (string.charAt(v) == 'a' || string.charAt(v) == 'e' || string.charAt(v) == 'i' || string.charAt(v) == 'o' || string.charAt(v) == 'u')
            {
                 results.increaseVovwelCount();
            }
            else if (string.charAt(v)>= 'a' &&  string.charAt(v)<='z')
            {
              results.increaseConsonantCount();
            }

        }

        return results;
    }


}
