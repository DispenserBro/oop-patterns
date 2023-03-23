package decorator.factory.calculator.log.impl;

import decorator.factory.calculator.log.Logger;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String out) {
        System.err.println(LocalDateTime.now() + ": " + out);
    }
}
