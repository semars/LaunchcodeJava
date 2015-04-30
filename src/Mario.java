import com.printer.ConsolePrinter;
import com.printer.FilePrinter;

import java.util.Scanner;

public class Mario {
    public static void main(String[] args) {
        Scanner rows_scan;
        Scanner printInput_scan;
        StringBuilder output = new StringBuilder();
        int rows;
        int printInput;
        int blocks;
        int spaces;

        System.out.println("Rows: ");
        rows_scan = new Scanner(System.in);
        rows = rows_scan.nextInt();
        if (rows < 1 || rows > 23) {
            System.out.println("Error. Rows must be between 1 and 23.");
        } else {
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

            do {
                System.out.println("Enter '1' to print to console or '2' to print to file.");
                printInput_scan = new Scanner(System.in);
                printInput = printInput_scan.nextInt();

                // print to console
                if (printInput == 1) {
                    ConsolePrinter printOutput = new ConsolePrinter();
                    printOutput.Print(output.toString());
                }
                // print to text file
                else if (printInput == 2) {
                    FilePrinter printOutput = new FilePrinter();
                    printOutput.Print(output.toString());
                }
                // invalid print selection
                else {
                    System.out.println("Error. Invalid print selection.");
                }
            }
            while (printInput != 1 && printInput != 2);
        }
    }
}
