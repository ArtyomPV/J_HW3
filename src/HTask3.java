import java.util.ArrayList;

/**
 * @author ArtyomPV
 */
/* Задан целочисленный список ArrayList. */
/*Найти минимальное, максимальное и среднее из этого списка. */
public class HTask3 {
    /**
     * Функция ищет минимальное значение в списке
     * @param numbers Список с рандомными значениями чисел
     * @return Возвращает минимальное значение в списке
     */
    public static int findMin(ArrayList<Integer> numbers){
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) < min){
                min = numbers.get(i);
            }
        }
        return min;
    }
    /**
     * Функция ищет максимальное значение в списке
     * @param numbers Список с рандомными значениями чисел
     * @return Возвращает максимальное значение в списке
     */
    public static int findMax(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for (int item : numbers) {
            if (item > max) max = item;
        }
        return max;
    }
    /**
     * Функция ищет среднеарифметическое  значение в списке
     * @param numbers Список с рандомными значениями чисел
     * @return Возвращает среднеарифметическое  значение в списке
     */
    public static double findAverage(ArrayList<Integer> numbers){
        if(numbers.size() != 0) {
            int sum = 0, avarage = 0;
            for (int item : numbers) {
                sum += item;
            }
            return (double)sum / numbers.size();
        } else {
            System.out.println("список пустой");
        }
        return 0;
    }
}
