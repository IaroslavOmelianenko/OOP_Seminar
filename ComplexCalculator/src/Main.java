
public class Main {
    public static void main(String[] args) {
        //Calculator
        iComplexCalculable calculator = new ComplexCalculator();

        //Decorator of calculator
        iComplexCalculable newCalcLog = new CalcDecorator(calculator, new Logger());

        //View with calculator
        ViewCalculator view = new ViewCalculator(newCalcLog);
        view.run();
    }
}