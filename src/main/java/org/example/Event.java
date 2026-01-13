package org.example;

public class Event {

    String kind;
    String timestamp;
    String function_name;

    public Event(String kind, String timestamp, String function_name) {
        this.kind = kind;
        this.timestamp = timestamp;
        this.function_name = function_name;
    }

    public void printDebug() {
        System.out.println(kind + " " + timestamp + " " + function_name);
    }
}
