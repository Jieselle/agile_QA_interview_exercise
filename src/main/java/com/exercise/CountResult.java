package com.exercise;

public class CountResult {
    private String word;
   private Integer vowelCount;
    private Integer  consonantCount;

    public CountResult(String word) {
        this.word = word;
        this.vowelCount = 0;
        this.consonantCount = 0;
    }


    public Integer increaseVovwelCount() {
        return ++vowelCount;
    }

    public Integer increaseConsonantCount() {
        return ++consonantCount;
    }

    @Override
    public String toString() {
        return " CountResult{" +
                "word='" + word + '\'' +
                ", vowelCount=" + vowelCount +
                " , consonantCount="+ consonantCount +
                '}';
    }
}
