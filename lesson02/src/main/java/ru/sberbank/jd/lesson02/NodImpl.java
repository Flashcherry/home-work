package ru.sberbank.jd.lesson02;

/**
 * Класс для вычисления наибольшего общего делителя двух целых чисел.
 */
public class NodImpl implements Nod {
    /**
     * Вычисляет наибольший общий делитель двух целых чисел.
     *
     * @param first  первое число
     * @param second второе число
     * @return наибольший общий делитель
     */
    @Override
    public int calculate(int first, int second) {
        if (first == 0 || second == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        int maxDivisor = 1;
        int maxNumber = Math.abs(Math.min(first, second));
        for (int i = 1; i <= maxNumber; i++) {
            if (first % i == 0 && second % i == 0) {
                maxDivisor = i;
            }
        }
        return maxDivisor;
    }
}
