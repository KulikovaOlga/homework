package var;

import javax.print.DocFlavor;
import java.util.Scanner;

import static java.lang.System.in;

public class variables {

    public static void main(String[] args) {
        task5();
    }


    //Задача 1 Пользователь вводит 2 числа (A и B). Выведите в консоль результат деления A на B и остаток от деления.

    public static void task1() {
        Scanner scanner = new Scanner(in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a / b;
        d = a % b;
        System.out.println(c);
        System.out.println(d);
    }


    //Задача 2 Пользователь вводит 2 числа (A и B). Выведите в консоль решение 5*A+B2B-A
    public static void task2() {
        Scanner scanner = new Scanner(in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();

        c = (5 * a + b * b) / b - a;
        System.out.println(c);
    }


    //Задача 3 Пользователь вводит 2 строковых(string) значения(A и B). Поменяйте содержимое переменных A и B местами.
    public static void task3() {
        Scanner scanner = new Scanner(in);
        String a = "Оля";
        String b = "Маша";
        String c;
        c = a;
        a = b;
        b = c;
        System.out.print(a + " " + b);
    }


    //Задача 4 Пользователь вводит 3 не равных 0 числа (A, B и С). Выведите в консоль решение(значение X) линейного уравнения стандартного вида, где A*X+B=C.
    public static void task4(){
        Scanner scanner = new Scanner(in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int x = (c - b) / a;
        System.out.println(x);
    }


    //Зачача 5 Пользователь вводит 4 числа (X1, Y1, X2, Y2), описывающие координаты 2-х точек на координатной плоскости. Выведите уравнение прямой в формате Y=AX+B, проходящей через эти точки.
    public static void task5() {
        Scanner scanner = new Scanner(in);
        int x1, x2, y1, y2;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        int a = (y1 - y2) / (x1 - x2);
        int b = y2 - a * x2;
        System.out.println("y" + "= " + a + "*x +" + b);
    }



        //Защита от дурака
        public static void task6() {
            Scanner scanner = new Scanner(in);
            int a = scanner.nextInt();
            while (a <= 0) a = scanner.nextInt();
            int count = 0;
            for (int i = 1; i < Math.sqrt(a); i++) count++;
            System.out.println(count);
        }
    }

