package calculator;


import history.History;
import history.OperationWithHistory;
import operator.Operator;
import printer.Printer;

public class MathCalculator implements Calculator {
    private final Printer printer;
    private final History history;

    public MathCalculator(Printer printer) {
        this.printer = printer;
        this.history = new History();
    }

    public void calculate(double first, double second, Operator operator) {
        double result = 0.0;

        switch (operator) {
            case Operator.SUM -> result = first + second;
            case Operator.SUBTRACTION -> result = first - second;
            case Operator.MULTIPLY -> result = first * second;
            case Operator.DIVIDE -> result = first / second;
        }
        history.operations(new OperationWithHistory(first, second, operator, result));

        printer.print(result);





    }
    public void printHistory(){
        history.printHistory();
    }


}
