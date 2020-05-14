package logic;

import data.MathElements;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MathOperationWriter {
    private static final String FILE_NAME = "MathOperationsResultInfo.txt";
    private static final File FILE = new File(FILE_NAME);

    public static void writeMathOperationsResultInfo(MathElements[] elements) {
        FileCreator.createFile(FILE);
        try (
                FileWriter fileWriter = new FileWriter(FILE_NAME);
                BufferedWriter writer = new BufferedWriter(fileWriter)
        ) {
            for (MathElements element : elements) {
                String line = element.getOperationInfo();
                writer.write(line);
                writer.newLine();
            }
            writer.write(MathOperation.getLastLine());
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + FILE_NAME);
        }
    }
}

