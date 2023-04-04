import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ArtyomPV
 */
public class HTask2 {
    int lowTreshold ;
    int highTreshold;
    //    Random random = new Random();
    HTask2(){
        lowTreshold = 10;
        highTreshold = 15;
    }

    /**
     * Функция получения списка рандомных чисел в диапозоне от 10 до 15 чисел
     * @param min Минимальный порог значения числа заполнения массива
     * @param max Максимальный порог значения числа число заполнения массива
     * @return Возвращает список рандомных чисел.
     */
    public ArrayList<Integer> fillNumbers(int min, int max){
        ArrayList<Integer> numbers = new ArrayList<>();
        if(min > max){
            int temp = max;
            max = min;
            min = temp;
        }
        int size = (int) Random.getRandomDoubleBetweenRange(lowTreshold, highTreshold);
        for (int i = 0; i < size; i++) {
            numbers.add((int) Random.getRandomDoubleBetweenRange(min, max));
        }
        return numbers;
    }

    /**
     * Функция удаления элементов списка, значение которых четное
     * @param list список
     * @return Возвращает список с нечетными значениями элементов.
     */
    public ArrayList<Integer> removeEvenNumbers(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%2 == 0){
                iterator.remove();
            }
        }
        return list;
    }

    /**
     * Функция вывода в терминал значений элементов списка
     * @param list список
     */
    public void showListNumbers(ArrayList<Integer> list){
        System.out.println(list);
    }
}

