public class ComplexNumberFactory {

    //Factory method for complex numbers
    public static ComplexNumber create(double real, double imaginary) {
        return new ComplexNumber(real, imaginary);
    }
}
