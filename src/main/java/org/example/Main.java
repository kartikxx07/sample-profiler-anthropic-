package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Sample s1 = new Sample("7.5", Arrays.asList("main"));
        Sample s2 = new Sample("9.2", Arrays.asList("main", "fn"));
        Sample s3 = new Sample("12", Arrays.asList("fn"));

        List<Sample> samples = Arrays.asList(s1, s2, s3);

        List<Event> events = convertToTrace(samples);

        for (Event e : events) {
            e.printDebug();
        }
    }

    private static List<Event> convertToTrace(List<Sample> samples) {
        int size = samples.size();
        List<String> prevStack = new ArrayList<>();

        return List.of(); // placeholder
    }
}
