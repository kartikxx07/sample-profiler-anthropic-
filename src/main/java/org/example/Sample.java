package org.example;

import java.util.List;
import java.util.Stack;

public class Sample {

    String timestamp;
    Stack<List<String>> callStack;

    public Sample(String timestamp, List<String> calls) {
        this.timestamp = timestamp;
        this.callStack = new Stack<>();
        this.callStack.push(calls);
    }
}
