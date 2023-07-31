import java.util.Scanner;

public class ViewCalculator {

    private iComplexCalculable calculator;

    public ViewCalculator(iComplexCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите действительную часть первого числа:");
        double real1 = scanner.nextDouble();

        System.out.println("Введите мнимую часть первого числа:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Введите действительную часть второго числа:");
        double real2 = scanner.nextDouble();

        System.out.println("Введите мнимую часть второго числа:");
        double imaginary2 = scanner.nextDouble();

        System.out.println("Введите математическое действие (+, *, /):");
        String mathAction = scanner.next();

        System.out.println("-------------------------------------------");

        //Creating complex numbers with factory
        ComplexNumber complexNumber1 = ComplexNumberFactory.create(real1, imaginary1);
        ComplexNumber complexNumber2 = ComplexNumberFactory.create(real2, imaginary2);


        switch (mathAction) {
            case "+":
                System.out.println("Сумма: " + calculator.sum(complexNumber1, complexNumber2));
                break;
            case "*":
                System.out.println("Произведение: " + calculator.multi(complexNumber1, complexNumber2));
                break;
            case "/":
                System.out.println("Частное: " + calculator.divide(complexNumber1, complexNumber2));
                break;
        }

    }
}