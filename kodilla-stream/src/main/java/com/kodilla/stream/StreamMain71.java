package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain71 {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Text1", (a) -> "ABC "+a+" ABC");
        poemBeautifier.beautify("Text2", (a) -> a.toUpperCase());
        poemBeautifier.beautify("Text3", (a) -> a.substring(2,a.length()-2));
        poemBeautifier.beautify("Text4", (a) -> a.substring(0,3).toUpperCase()+a.substring(2));
    }
}
