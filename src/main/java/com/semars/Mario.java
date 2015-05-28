package com.semars;

import com.semars.printer.ConsolePrinter;
import com.semars.printer.FilePrinter;
import com.semars.pyramid.Pyramid;
import com.semars.pyramid.PyramidBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

class Mario {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Mario obj = (Mario) context.getBean("mario");
        obj.start();
    }

    private final PyramidBuilder pyramidBuilder;

    public Mario(PyramidBuilder pyramidBuilder) {
        this.pyramidBuilder = pyramidBuilder;
    }

    private void start() {
        Scanner rows_scan = new Scanner(System.in);
        int rows;
        do {
            System.out.print("Rows: ");
            rows = rows_scan.nextInt();
        } while (rows < 1 || rows > 23);

        Pyramid outPyramid = pyramidBuilder.buildPyramid(rows);

        Scanner printInput_scan = new Scanner(System.in);
        int printInput;
        do {
            System.out.println("Enter '1' to print to console or '2' to print to file.");
            printInput = printInput_scan.nextInt();
        } while (printInput != 1 && printInput != 2);

        // print to console
        if (printInput == 1) {
            ConsolePrinter printOutput = new ConsolePrinter();
            printOutput.Print(outPyramid);
        }
        // print to text file
        else {
            FilePrinter printOutput = new FilePrinter();
            printOutput.Print(outPyramid);
        }
    }
}
