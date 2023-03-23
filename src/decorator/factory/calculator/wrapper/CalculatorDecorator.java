package decorator.factory.calculator.wrapper;

import decorator.factory.calculator.Calculable;
import decorator.factory.calculator.log.Logger;

public class CalculatorDecorator implements Calculable {
    private Calculable calc;
    private Logger logger;

    public CalculatorDecorator(Calculable calc, Logger logger) {
        this.calc = calc;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        logger.log("Calculating sum of: " + calc.getResult() + " and " + arg);
        Calculable res = calc.sum(arg);
        logger.log("Result: " + res.getResult());
        return res;
    }

    @Override
    public Calculable multi(int arg) {
        logger.log("Calculating mul of: " + calc.getResult() + " and " + arg);
        Calculable res = calc.multi(arg);
        logger.log("Result: " + res.getResult());
        return res;
    }

    @Override
    public int getResult() {
        return calc.getResult();
    }
}
