package com.pyramid;

import java.util.Scanner;
import com.printer.ConsolePrinter;
import com.printer.FilePrinter;


public class Pyramid {
    Scanner rows_scan = new Scanner(System.in);
    public int rows;

    public Pyramid()
    {
        do {
            System.out.print("Rows: ");
            rows = rows_scan.nextInt();
        } while (rows < 1 || rows > 23);
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        int blocks;
        int spaces;
        for (int i = 1; i <= rows; i++) {
            blocks = i + 1;
            spaces = rows - i;
            for (int k = 0; k < spaces; k++) {
                output.append(" ");
            }
            for (int j = 0; j < blocks; j++) {
                output.append("#");
            }
            output.append("\r\n");
        }
        return output.toString();
    }

    public void printerInput() {
        Scanner printInput_scan = new Scanner(System.in);
        int printInput;
        do {
            System.out.println("Enter '1' to print to console or '2' to print to file.");
            printInput = printInput_scan.nextInt();
        } while (printInput != 1 && printInput != 2);

        // print to console
        if (printInput == 1) {
            ConsolePrinter printOutput = new ConsolePrinter();
            printOutput.Print(this);
        }
        // print to text file
        else {
            FilePrinter printOutput = new FilePrinter();
            printOutput.Print(this);
        }
    }
}