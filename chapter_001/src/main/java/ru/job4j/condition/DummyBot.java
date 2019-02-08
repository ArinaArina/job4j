package ru.job4j.condition;

/**
 * Class DummyBot отвечает на вопросы.
 * @author Arina Vakurova.
 * @since 8.02.2019.
 * @version 1.
 */
public class DummyBot {
    /**
     * Отвечает на вопросы.
     * @param question - вопрос от клиента.
     * @return ответ от бота.
     */
    public String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
