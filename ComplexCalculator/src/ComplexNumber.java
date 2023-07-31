public class ComplexNumber {
    private double real;
    private double imaginary;

    //Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    //Getters, setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    //Math operations



    //toString
    @Override
    public String toString() {
        if (this.imaginary < 0) {
            return this.real + " - " + Math.abs(this.imaginary) + "i";
        } else {
            return this.real + " + " + this.imaginary + "i";
        }
    }


    //Math methods for complex numbers
    public ComplexNumber sum(ComplexNumber number) {
        return new ComplexNumber(real + number.getReal(), imaginary + number.getImaginary());
    }

    public ComplexNumber multi(ComplexNumber number) {
        double newReal = real * number.getReal() - imaginary * number.getImaginary();
        double newImaginary = real * number.getImaginary() + imaginary * number.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber number) {
        double denominator = Math.pow(number.getReal(), 2) + Math.pow(number.getImaginary(), 2);
        double newReal = (real * number.getReal() + imaginary * number.getImaginary()) / denominator;
        double newImaginary = (imaginary * number.getReal() - real * number.getImaginary()) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
}
