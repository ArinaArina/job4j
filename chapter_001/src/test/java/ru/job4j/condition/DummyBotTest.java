package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Arina Vakurova.
 * @since 8.02.2019.
 * @version 1.
 */
public class DummyBotTest {
    /**
     * Test answer.
     * Проверяет если введено "Привет, Бот.".
     */
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Привет, Бот."), is("Привет, умник."));
    }

    /**
     * Test answer.
     * Проверяет если введено "Пока.".
     */
    @Test
    public void whenByeBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Пока."), is("До скорой встречи."));
    }

    /**
     * Test answer.
     * Проверяет если введено что-то неизвестное боту.
     */
    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(bot.answer("Сколько будет 2 + 2?"), is("Это ставит меня в тупик. Задайте другой вопрос."));
    }
}
