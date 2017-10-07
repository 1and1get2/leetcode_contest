package com.derek;

public class Main {
    public static final boolean DEBUG = true;

    public static final void print(String message) {
        if (DEBUG) {
            System.out.print(message);
        }
    }

    public static final void println(String message) {
        if (DEBUG) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        println("aaa");
    }
}
