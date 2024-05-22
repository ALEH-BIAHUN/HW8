import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        int[] array = {12, 22, 3, 54, 5, 4, 7, 88, 32, 62};

        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("***********************\n");

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        for (int i = array.length - 1; i >=0 ; i--) {
            System.out.println(array[i]);
        }

        System.out.println("***********************\n");

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        for (int i = 0; i < array.length /2; i++){
            int temp = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = temp;
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("***********************\n");

        int numberOfPeople = 10;
        int minWeight = 40;
        int maxWeight = 100;

        int[] weights = new int[numberOfPeople];

        Random random = new Random();

        for (int i = 0; i < numberOfPeople; i++) {
            weights[i] = random.nextInt((maxWeight - minWeight) + 1) + minWeight;
        }
        System.out.println("Generated weights for 10 people:");
        for (int weight : weights) {
            System.out.println(weight);
        }
    }
}