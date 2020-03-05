package ru.job4j.condition.bot;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {

            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String ask = "Привет, Бот.";
        System.out.println(answer(ask));

        ask = "Пока.";
        System.out.println(answer(ask));

        ask = "Как дела?";
        System.out.println(answer(ask));
    }
}
