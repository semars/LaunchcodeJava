package com.printer;

/**
 * Created by semar on 4/25/15.
 */
public class ConsolePrinter implements Printer {
    public void Print(String output) {
        System.out.print(output);
    }
}