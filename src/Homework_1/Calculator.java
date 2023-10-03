package Homework_1;

import static org.assertj.core.api.Assertions.*;

public class Calculator {
    public static void main(String[] args) {
        int summ = calculation(2, 3, '+');
        double proc = squareRootExtraction(summ);
        System.out.println(summ);
        System.out.println(proc);
        try{
            System.out.println(calculatingDiscount(238.8, 25));
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double squareRootExtraction(double number) {
        if (number == 0) {
            throw new ArithmeticException("It is not possible to extract the root from 0");
        }
        if (number < 0) {
            throw new ArithmeticException("It is impossible to extract the root from negative numbers");
        }

        double t;
        double squareRoot = number / 2;
        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        }
        while ((t - squareRoot) != 0);
        return squareRoot;

        // или просто return Math.sqrt(number);
    }

    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0) throw new ArithmeticException("Число " + purchaseAmount + " отрицательное");
        else if (discountAmount < 0) throw new ArithmeticException("Число " + discountAmount + " отрицательное");
        else {
            assert (Integer.MAX_VALUE - (int) purchaseAmount > discountAmount) : "Число выходит за максимальный предел";
            assert (Double.MAX_VALUE - (double) discountAmount > purchaseAmount) : "Число выходит за максимальный предел";
        }
        return purchaseAmount - discountAmount;
    }

}