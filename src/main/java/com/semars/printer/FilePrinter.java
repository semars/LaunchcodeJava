package com.semars.printer;

import com.semars.pyramid.Pyramid;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrinter implements Printer {
    public void Print(Pyramid output) {
        File outfile = new File("mario.txt");
        try (PrintWriter writer = new PrintWriter(outfile)) {
            writer.write(output.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Error. Writing to file could not be completed." + e.getMessage());
            e.printStackTrace();
        }
    }
}
