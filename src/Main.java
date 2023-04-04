import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //======== Task 1 =====================
        /* Реализовать алгоритм сортировки слиянием */
//
//        HTask1 ht = new HTask1();
//        int[] array = ht.createArray();
//        ht.mergeArrays(array);
//        ht.showArray(array);

        //======== Task 2 =====================
        /* Пусть дан произвольный список целых чисел, удалить из него чётные числа */

//        HTask2 hTask2 = new HTask2();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите нижний порог значения элемента массива: ");
//        int min = sc.nextInt();
//        System.out.println("Введите верхний порог значения элемента массива: ");
//        int max = sc.nextInt();
//        sc.close();
//        ArrayList<Integer> numbers = hTask2.fillNumbers(min, max);
//        hTask2.showListNumbers(numbers);
//        hTask2.showListNumbers(hTask2.removeEvenNumbers(numbers));

        //======== Task 3 =====================
        /* Задан целочисленный список ArrayList. */
        /*Найти минимальное, максимальное и среднее из этого списка. */

        HTask2 hTask2 = new HTask2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите нижний порог значения элемента массива: ");
        int min = sc.nextInt();
        System.out.println("Введите верхний порог значения элемента массива: ");
        int max = sc.nextInt();
        sc.close();

        ArrayList<Integer> numbers = hTask2.fillNumbers(min, max);
        hTask2.showListNumbers(numbers);

        int minNumber = HTask3.findMin(numbers);
        System.out.println("Минимальное число в списке: " + minNumber);
        int maxNumber = HTask3.findMax(numbers);
        System.out.println("Максимальное число в списке: " + maxNumber);
        double averageNumber = HTask3.findAverage(numbers);
        System.out.println("Средние занчение чисел в списке: " + averageNumber);

    }
}