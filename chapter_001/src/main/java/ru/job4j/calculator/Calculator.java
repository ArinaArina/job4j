package ru.job4j.calculator;

/**
 * Class Calculator для вычисления арифметических действий (+, -, /, *).
 * @author Arina Vakurova.
 * @since 7.02.2019.
 * @version 1.
 */
public class Calculator {
    /**
     * Результат арифметических действий.
     */
    private double result;

    /**
     * Сложение.
     * @param first - первое число.
     * @param second - второе число.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Вычитание.
     * @param first - первое число.
     * @param second - второе число.
     */
    public void sub(double first, double second) {
        this.result = first - second;
    }

    /**
     * Деление.
     * @param first - первое число.
     * @param second - второе число.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Умножение.
     * @param first - первое число.
     * @param second - второе число.
     */
    public void mult(double first, double second) {
        this.result = first * second;
    }

    /**
     * Получение результата.
     * @return результат.
     */
    public double getResult() {
        return this.result;
    }
}
