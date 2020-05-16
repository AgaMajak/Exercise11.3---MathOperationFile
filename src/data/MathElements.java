package data;

public class MathElements {
    private int numberA;
    private char symbol;
    private int numberB;

    public MathElements(int numberA, char symbol, int numberB) {
        this.numberA = numberA;
        this.symbol = symbol;
        this.numberB = numberB;
    }


    public String getOperationInfo() {
        switch (symbol) {
            case '+':
                return String.format("%d %c %d = %d", numberA, symbol, numberB, numberA + numberB);
            case '-':
                return String.format("%d %c %d = %d", numberA, symbol, numberB, numberA - numberB);
            case '*':
                return String.format("%d %c %d = %d", numberA, symbol, numberB, numberA * numberB);
            case '/':
                return String.format("%d %c %d = %d", numberA, symbol, numberB, numberA / numberB);
            default:
                return "Błędny znak";
        }
    }
}
