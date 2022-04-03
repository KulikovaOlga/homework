package ifelse;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        task5();
    }


    //Задача 1 Пользователь вводит 2 числа (A и B). Если A>B, подсчитать A+B, если A=B, подсчитать A*B, если A<B, подсчитать A-B.
    public static void task1() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a > b) {
            System.out.println(a + b);
        } else if (a < b) {
            System.out.println(a - b);
        } else {
            System.out.println(a * b);
        }
    }

    //Задача 2 Пользователь вводит 2 числа (X и Y). Определить какой четверти принадлежит точка с координатами (X,Y).
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();

        if ((x > 0) & (y > 0)) {
            System.out.println("top right");

        } else if ((x < 0) & (y > 0)) {
            System.out.println("top left");

        } else if ((x > 0) & (y < 0)) {
            System.out.println("bottom right");

        } else if ((x < 0) & (y < 0)) {
            System.out.println("bottom left");
        }
    }

    //Задача 3 Пользователь вводит 3 числа (A, B и С). Выведите их в консоль в порядке возрастания.
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, x;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a > b) {
            x = a;
            a = b;
            b = x;
        } else a = a;
        if (b > c) {
            x = b;
            b = c;
            c = x;
        } else b = b;
        if (a > b) {
            x = a;
            a = b;
            b = x;
        } else c = c;

        System.out.println(a + " " + b + " " + c);
    }


    //Задача 4 Пользователь вводит 3 числа (A, B и С). Выведите в консоль решение(значения X) квадратного уравнения стандартного вида, где AX2+BX+C=0.
    public static void task4() {
        double x1, x2;
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }


    //Задача 5 Пользователь вводит двузначное число. Выведите в консоль прописную запись этого числа. Например при вводе “25” в консоль будет выведено “двадцать пять”.
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if ((number > 9) && (number < 20)) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        }
        else if ((number >= 20) && (number < 100)) {
            int value = number / 10;
            switch (value) {
                case 2:
                    System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("fourty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eighty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
                    int value2 = number % 10;
                    switch (value2) {
                        case 1:
                            System.out.print("one");
                            break;
                        case 2:
                            System.out.print("two");
                            break;
                        case 3:
                            System.out.print("three");
                            break;
                        case 4:
                            System.out.print("four");
                            break;
                        case 5:
                            System.out.print("five");
                            break;
                        case 6:
                            System.out.print("six");
                            break;
                        case 7:
                            System.out.print("seven");
                            break;
                        case 8:
                            System.out.print("eight");
                            break;
                        case 9:
                            System.out.print("nine");
                            break;
                    }
                }
            }

    //Задача 6 Определить, попадает ли точка M(x,y) в круг радиусом r с центром в точке (x0,y0)
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int x0, y0, r, x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        x0 = scanner.nextInt();
        y0 = scanner.nextInt();
        r = scanner.nextInt();
        double leght = Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2));
        if (r > leght) {
            System.out.println("In circle");
        } else if (r == leght) {
            System.out.println("On the circle");
        } else {
            System.out.println("Out the circle");
        }
    }

    //Задача 7
    // квадрат заданного трехзначного числа равен кубу суммы цифр этого числа;
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        int a, sum = 0;
        boolean result;
        a = scanner.nextInt();
        while(a != 0){
            sum += (a % 10);
            a/=10;
        }
        if (a*a == sum*sum*sum) result = true;
        else result = false;
        System.out.println(result);
    }

    // сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр;
    public static void task8(){
        Scanner scanner = new Scanner(System.in);
        int a, sum=0, sum2=0;
        boolean result;
        a = scanner.nextInt();
        sum += (a % 10);
        a/=10;
        sum += (a % 10);
        a/=10;
        sum2 += (a % 10);
        a/=10;
        sum2 += (a % 10);
        a/=10;
        if (sum == sum2) result = true;
        else result = false;
        System.out.println(result);

    }

    //среди цифр заданного трехзначного числа есть одинаковые;
    public static void task9(){
        Scanner scanner = new Scanner(System.in);
        int x, a, b, c;
        boolean result;
        x = scanner.nextInt();
        a = (x % 10);
        x/=10;
        b = (x % 10);
        x/=10;
        c = (x % 10);
        x/=10;
        if ((a==c) || (a==b) || (c==b)) result = true;
        else result = false;
        System.out.println(result);
    }
}