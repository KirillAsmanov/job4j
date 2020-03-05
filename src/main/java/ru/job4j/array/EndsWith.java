package ru.job4j.array;

/**
 * 6.4.1. Слово заканчивается с ...[#244908]
 * @author Kirill Asmanov
 * @since 02.03.2020
 * @version 1.0.0;
 */
public class EndsWith {
    /**
     * Этот метод проверяет, что слово заканчивается на определенную последовательность
     * @param word - проверяемое слово
     * @param pref - последовательность символов, на которую  заканчивается или не заканчивается слово word
     * @return true, если заканчивается, false - если нет
     */
    public static boolean endsWith(char[] word, char[] pref) {
        boolean result = true;

        for (int i = 0; i < pref.length; i++) {
            if (word[word.length - pref.length + i] != pref[i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}