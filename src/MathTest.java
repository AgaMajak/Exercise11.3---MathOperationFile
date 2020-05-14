import data.MathElements;
import logic.MathOperation;
import logic.MathOperationWriter;

import java.io.FileNotFoundException;

public class MathTest {
    public static void main(String[] args) throws FileNotFoundException {

        MathElements[] elements = MathOperation.mathElements();
        MathOperation.printAllOperations(elements);
        MathOperationWriter.writeMathOperationsResultInfo(elements);

    }
}
