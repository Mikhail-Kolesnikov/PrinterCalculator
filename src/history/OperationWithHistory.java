package history;

import operator.Operator;

public class OperationWithHistory {

    private double first;
    private double second;
    private String operator;
    private double result;

    public OperationWithHistory(double first, double second, String operator, double result) {
        this.first = first;
        this.second = second;
        this.operator = operator;
        this.result = result;
    }

    public String stringOperation(){
        return first + " " + operator + " " + second + " = " + result;
    }
}
