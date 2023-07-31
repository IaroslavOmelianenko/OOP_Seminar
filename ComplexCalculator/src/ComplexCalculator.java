public final class ComplexCalculator implements iComplexCalculable {

    //iComplexCalculable methods
    @Override
    public ComplexNumber sum(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        return complexNumber1.sum(complexNumber2);
    }

    @Override
    public ComplexNumber multi(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        return complexNumber1.multi(complexNumber2);
    }

    @Override
    public ComplexNumber divide(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        return complexNumber1.divide(complexNumber2);
    }
}