package array;

import java.util.Random;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        task1();
    }

    //Задача 1 Найти минимальный элемент массива
    public static void task1() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(min);

    }

    //Задача 2 Найти максимальный элемент массива
    public static void task2() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(max);
    }

    //Задача 3 Найти индекс минимального элемента массива
    public static void task3() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min){
                min = i;
            }
        }
        System.out.println(min);
    }

    //Задача 4 Найти индекс максимального элемента массива
    public static void task4() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        System.out.println(max);
    }

    //Задача 5 Посчитать сумму элементов массива с нечетными индексами
    public static void task5() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0)
                sum += a[i];
        }
        System.out.print(sum);
    }

    // Задача 6 Сделать реверс массива (массив в обратном направлении)
    public static void task6() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        printArray(a, n);
    }

    //Задача 7 Посчитать количество нечетных элементов массива
    public static void task7() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0)
                count++;
        }
        System.out.println(count);
    }

    //Задача 8 Поменять местами первую и вторую половину массива, например, для массива 1 2 3 4, результат 3 4 1 2,  или для 12345 - 45312.
    public static void task8() {
        int n = 20;
        int b = n % 2;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n / 2 + i + b];
            a[n / 2 + i + b] = temp;
            System.out.print(a[i]);
        }
    }

    //Задача 9 Отсортировать массив по возрастанию (Bubble)
    public static void task9() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        boolean flag;
        for (int k = 0; k < n - 1; k++) { // пузырек возрастание
            flag = false;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    flag = true;
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
            if (!flag) break;
        }
        printArray(a, n);
    }

    //Задача 10 Отсортировать массив по убыванию (Bubble)
    public static void task10() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        for (int k = 0; k < n - 1; k++) {
            for (int i = 1; i < n; i++) {
                if (a[i] > a[i - 1]) {
                    int temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                }
            }
        }
        printArray(a, n);
    }

    //Задача 11 Отсортировать массив по возрастанию (Select)
    public static void task11() {
        int n = 20;
        int a[] = inputArrayWithRandom(n, 0, 20);
        printArray(a, n);

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            System.out.print(a[i]);
        }
    }


    public static void printArray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static int[] inputArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        return a;
    }

    public static int[] inputArrayWithRandom(int n, int a, int b) {
        Random random = new Random();
        n = 20;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = random.nextInt(a, b);
        return arr;
    }
}


