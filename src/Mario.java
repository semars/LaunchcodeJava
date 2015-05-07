import com.printer.ConsolePrinter;
import com.printer.FilePrinter;
import com.pyramid.Pyramid;
import com.pyramid.PyramidBuilder;

import java.util.Scanner;

class Mario {

    private PyramidBuilder pyramidBuilder;

    public static void main(String[] args) {
        Mario init = new Mario(PyramidBuilder.getInstance());
        init.start();
    }

    public Mario(PyramidBuilder pyramidBuilder)
    {
        this.pyramidBuilder = pyramidBuilder;
    }

    private void start() {
        Scanner rows_scan = new Scanner(System.in);
        int rows;
        do {
            System.out.print("Rows: ");
            rows = rows_scan.nextInt();
        } while (rows < 1 || rows > 23);

        Pyramid outPyramid = PyramidBuilder.getInstance().pyramid(rows);

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
