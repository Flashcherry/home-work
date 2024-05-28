package ru.sberbank.jd.lesson02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Класс с тестами проверки функции calculate.
 */
class NodImplTest {

    NodImpl nod = new NodImpl();

    @Test
    @DisplayName("Тест проверки вычисления наибольшего общего делителя")
    void calculateTest() {
        Assertions.assertNotEquals(1, nod.calculate(2, 2), "Общий наибольший делитель не должен быть равен 1");
        Assertions.assertEquals(7, nod.calculate(49, 7), "Общий наибольший делитель должен быть равен 7");
        Assertions.assertEquals(1000, nod.calculate(10000, 1000), "Общий наибольший делитель должен быть равен 1000");
        Assertions.assertEquals(1000, nod.calculate(-10000, -1000), "Общий наибольший делитель должен быть равен 1000");
        Assertions.assertEquals(1000, nod.calculate(-10000, 1000), "Общий наибольший делитель должен быть равен 1000");
        Assertions.assertEquals(1000, nod.calculate(10000, -1000), "Общий наибольший делитель должен быть равен 1000");
    }

    @Test
    @DisplayName("Тест проверки выбрасываемого исключения")
    void calculateExceptionTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            nod.calculate(0, 0);
        }, "Должно быть исключение ArithmeticException");
        Assertions.assertThrows(ArithmeticException.class, () -> {
            nod.calculate(0, 51);
        }, "Должно быть исключение ArithmeticException");
        Assertions.assertThrows(ArithmeticException.class, () -> {
            nod.calculate(13, 0);
        }, "Должно быть исключение ArithmeticException");
    }
}