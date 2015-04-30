package com.printer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by semar on 4/25/15.
 */
public class FilePrinter implements Printer {
    public void Print(String output) {
        File outfile = new File("mario.txt");
        try (PrintWriter writer = new PrintWriter(outfile)) {
            writer.write(output);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error. Writing to file could not be completed." + e.getMessage());
            e.printStackTrace();
        }
    }
}
