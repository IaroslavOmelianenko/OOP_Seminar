public class CalcDecorator implements iComplexCalculable{

    private iComplexCalculable oldCalc;
    private Logger logger;

    public CalcDecorator(iComplexCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public ComplexNumber sum(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        logger.log("Первое комплексное число: " +complexNumber1 + "\nВторое комплексное число: " +complexNumber2);
        return complexNumber1.sum(complexNumber2);
    }

    @Override
    public ComplexNumber multi(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        logger.log("Первое комплексное число: " +complexNumber1 + "\nВторое комплексное число: " +complexNumber2);
        return complexNumber1.multi(complexNumber2);
    }

    @Override
    public ComplexNumber divide(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        logger.log("Первое комплексное число: " +complexNumber1 + "\nВторое комплексное число: " +complexNumber2);
        return complexNumber1.divide(complexNumber2);
    }
}
