package ru.job4j.array;
/**
 * Упр. 6.3. Массив заполнен true или false[#244905]
 * @author Kirill Asmanov
 * @since 02.03.2020
 * @version 1.0.0;
 */
public class Check {
    /**
     * Метод, проверяющий заполненность булева массива на однородность данных
     * @param data - проверяемый массив
     * @return - true, если массив однороден (все элементы либо true, либо false), false - в обратном случае
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean measure = data[0];
        for (int i = 0; i < data.length; i++) {
            if (measure != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
