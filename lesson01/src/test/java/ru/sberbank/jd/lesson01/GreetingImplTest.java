package ru.sberbank.jd.lesson01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class GreetingImplTest {

    GreetingImpl greeting = new GreetingImpl();

    @Test
    @DisplayName("Тест получения имени")
    void getFirstNameTest() {
        Assertions.assertFalse(greeting.getFirstName().isEmpty(), "Возвращаемое значение не должно быть пустым");
        Assertions.assertNotEquals(greeting.getFirstName(), "Вася", "Имя не должно быть Вася");
        Assertions.assertEquals(5, greeting.getFirstName().length(), "Имя состоит из 5 символов");
        Assertions.assertTrue(greeting.getFirstName().equalsIgnoreCase("мария"), "Имя должно быть мария(без учета регистра)");
        Assertions.assertEquals(greeting.getFirstName(), "Мария", "Имя должно быть Mария");
    }

    @Test
    @DisplayName("Тест получения фамилии")
    void getLastNameTest() {
        Assertions.assertFalse(greeting.getLastName().isEmpty(), "Возвращаемое значение не должно быть пустым");
        Assertions.assertNotEquals(greeting.getLastName(), "Петрова", "Фамилия не должна быть Петрова");
        Assertions.assertEquals(9, greeting.getLastName().length(), "Фамилия состоит из 9 символов");
        Assertions.assertTrue(greeting.getLastName().startsWith("Глу"), "Фамилия должнa начинаться на Глу");
        Assertions.assertEquals(greeting.getLastName(), "Глухарева", "Фамилия должнa быть Глухарева");
    }

    @Test
    @DisplayName("Тест получения года рождения")
    void getBirthYearTest() {
        Assertions.assertNotEquals(1991, greeting.getBirthYear(), "Год рождения не должен быть 1991");
        Assertions.assertEquals(1990, greeting.getBirthYear(), "Год рождения должен быть 1990");
        Assertions.assertTrue(greeting.getBirthYear() > 1980, "Год рождения должен быть больше 1980");
        Assertions.assertFalse(greeting.getBirthYear() > 2000, "Год рождения не должен быть больше 2000");
    }

    @Test
    @DisplayName("Тест получения коллекции хобби")
    void getHobbiesTest() {
        Assertions.assertFalse(greeting.getHobbies().isEmpty(), "Возвращаемое значение не должно быть пустым");
        Assertions.assertNotEquals(2, greeting.getHobbies().size(), "В коллекции хобби не должно быть 2 элемента");
        Assertions.assertEquals(4, greeting.getHobbies().size(), "Коллекция хобби должна состоять из 4 элементов");
        Assertions.assertTrue(greeting.getHobbies().contains("home"), "Коллекция хобби должна содержать - home");
        Assertions.assertEquals(greeting.getHobbies(), List.of("work", "home", "family", "car"), "Коллекция хобби равна - work, home, family, car");

    }

    @Test
    @DisplayName("Тест получения ссылки на репозиторий")
    void getRepoUrlTest() {
        Assertions.assertEquals("https://github.com/Flashcherry/home-work.git", greeting.getRepoUrl(), "Ссылка на репозиторий должна быть https://github.com/Flashcherry/home-work.git");
        Assertions.assertTrue(greeting.getRepoUrl().contains("/home-work.git"), "Ссылка на репозиторий должна содержать - /home-work.git");
    }

    @Test
    @DisplayName("Тест получения номера телефона")
    void getPhoneTest() {
        Assertions.assertTrue(greeting.getPhone().startsWith("8"), "Номер телефона должен начинаться с 8");
        Assertions.assertFalse(greeting.getPhone().startsWith("+7"), "Номер телефона не должен начинаться с +7");
        Assertions.assertTrue(greeting.getPhone().matches("8-(\\d{3}-){2}\\d{2}-\\d{2}"), "Номер телефона должен соответствовать маске с 8-***-***-**-**");
        Assertions.assertEquals("8-908-385-58-58", greeting.getPhone(), "Номер телефона должен быть 8-908-385-58-58");
    }

    @Test
    @DisplayName("Тест получения ожиданий от курса")
    void getCourseExpectationsTest() {
        Assertions.assertFalse(greeting.getCourseExpectations().isEmpty(), "Возвращаемое значение не должно быть пустым");
        Assertions.assertNotEquals(1, greeting.getCourseExpectations().size(), "Ожидания от курса не должны состоять из 1 элемента");
        Assertions.assertEquals(3, greeting.getCourseExpectations().size(), "Ожидания от курса должны состоять из 3 элементов");
        Assertions.assertTrue(greeting.getCourseExpectations().contains("career"), "Ожидания от курса должны содержать - career");
        Assertions.assertEquals(2, greeting.getCourseExpectations().stream().filter(c -> c.toLowerCase().contains("java")).count(), "Ожидания от курса должны содержать 2 элемента с текстом Java без учета регистра");
    }
}
