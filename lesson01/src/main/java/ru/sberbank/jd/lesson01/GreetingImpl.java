package ru.sberbank.jd.lesson01;

import java.util.Collection;
import java.util.List;

/**
 * Класс для получения данных о студенте для приветствия.
 */
public class GreetingImpl implements Greeting {
    /**
     * Получение имени.
     */
    @Override
    public String getFirstName() {
        return "Мария";
    }

    /**
     * Получение фамилии.
     */
    @Override
    public String getLastName() {
        return "Глухарева";
    }

    /**
     * Получение года рождения.
     */
    @Override
    public int getBirthYear() {
        return 1990;
    }

    /**
     * Получение набора хобби.
     */
    @Override
    public Collection<String> getHobbies() {
        return List.of("work", "home", "family", "car");
    }

    /**
     * Получение имени репозитория.
     */
    @Override
    public String getRepoUrl() {
        return "https://github.com/Flashcherry/home-work.git";
    }

    /**
     * Получение номера телефона.
     */
    @Override
    public String getPhone() {
        return "8-908-385-58-58";
    }

    /**
     * Получение набора ожиданий от курса.
     */
    @Override
    public Collection<String> getCourseExpectations() {
        return List.of("become a Java princess", "learn more JAVA", "career");
    }
}
