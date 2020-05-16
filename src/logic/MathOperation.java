package logic;

import data.MathElements;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MathOperation {
    private static final String LAST_LINE = "....";
    private static final String FILE_NAME = "MathOperations.txt";
    private static final File FILE = new File(FILE_NAME);

    private static int getLines() throws FileNotFoundException {
        Scanner scan = new Scanner(FILE);
        int lines = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            lines++;
        }
        scan.close();
        return lines - 1;
    }

    public static MathElements[] mathElements() throws FileNotFoundException {
        Scanner scanner = new Scanner(FILE);
        int i = 0;
        int lines = getLines();
        MathElements[] elements = new MathElements[lines];
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (LAST_LINE.equals(line)) {
                break;
            }
            String[] lineElements = line.split(" ");
            String numberA = lineElements[0];
            String symbol = lineElements[1];
            String numberB = lineElements[2];
            int parseA = Integer.parseInt(numberA);
            char convertedSymbol = symbol.charAt(0);
            int parseB = Integer.parseInt(numberB);
            elements[i] = new MathElements(parseA, convertedSymbol, parseB);
            i++;
        }
        scanner.close();
        return elements;
    }

    public static void printAllOperations(MathElements[] elements) {
        for (MathElements element : elements) {
            System.out.println(element.getOperationInfo());
        }
        System.out.println(LAST_LINE);
    }

    public static String getLastLine() {
        return LAST_LINE;
    }
}

