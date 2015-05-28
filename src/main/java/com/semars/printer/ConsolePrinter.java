package com.semars.printer;

import com.semars.pyramid.Pyramid;

public class ConsolePrinter implements Printer {
    public void Print(Pyramid output) {
        System.out.print(output.toString());
    }
}