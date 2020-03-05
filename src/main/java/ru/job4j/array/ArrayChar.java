package ru.job4j.array;
/**
 * 6.4. Слово начинается с ...[#244904]
 * @author Kirill Asmanov
 * @since 02.03.2020
 * @version 1.0.0;
 */
public class ArrayChar {
    /**
     * Этот метод проверяет, что слово начинается c определенной последовательности
     * @param word - проверяемое слово
     * @param pref - последовательность символов, с которого начинается или не начинается слово word
     * @return true, если начинается, false - если нет
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;

        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
