package Main;

import calculator.MathCalculator;
import parser.StringParser;
import printer.ConsolePrinter;
import printer.FilePrinter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsolePrinter consolePrinter= new ConsolePrinter();
  //
        //      ConsolePrinter printer = new ConsolePrinter();
        MathCalculator calculator = new MathCalculator(consolePrinter);
        Scanner scanner = new Scanner(System.in);
        StringParser parser= new StringParser(calculator,scanner);
        calculator.printHistory();

        parser.parse();





    }
}
