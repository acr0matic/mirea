package mirea.isbo1016.mateyuk.pract5;

import java.util.Scanner;

public class MainClass {

    public static String task1(int n) {
        int sum = 0;
        int j = 0;

        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            System.out.print(task1(--n) + " " + j);
        }
        return "";
    }

    public static String task2(int n) {
        if (n == 1)
            return "1";

        return task2(n - 1) + " " + n;
    }

    public static String task3(int a, int b) {
        if (a > b) {
            if (a == b)
                return Integer.toString(a);

            return a + " " + task3(a - 1, b);
        } else {
            if (a == b)
                return Integer.toString(a);

            return a + " " + task3(a + 1, b);
        }
    }

    public static int task4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += task4(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int task5(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + task5(n / 10);
    }

    public static boolean task6(int n, int i) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % i == 0)
            return false;
        else if (i < n / 2)
            return task6(n, i + 1);
        else
            return true;
    }

    public static void task7(int n, int k) {

        if (k > n / 2) {
            System.out.print(n + " ");
            return;
        }
        if (n % k == 0) {
            System.out.print(k + " ");
            task7(n / k, k);
        } else
            task7(n, ++k);
    }

    public static String task8(String s) {
        if (s.length() == 1)
            return "YES";
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return task8(s.substring(1, s.length() - 1));
            } else
                return "NO";

        }
    }

    public static int task9(int a, int b) {
        if (a > b + 1)
            return 0;

        if (a == 0 || b == 0)
            return 1;

        return task9(a, b - 1) + task9(a - 1, b - 1);
    }

    public static int task10(int n, int i) {
        return (n == 0) ? i : task10(n / 10, i * 10 + n % 10);
    }

    public static int task11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1) {
            int m = in.nextInt();
            if (m == 1) {
                return task11() + n + m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return task11() + n + m + k;
                } else {
                    return n + m + k;
                }
            }
        } else {
            int m = in.nextInt();
            if (m == 1) {
                return task11() + n + m;
            } else {
                return n + m;
            }
        }
    }

    public static void task12() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                task12();
            } else
                task12();
        }
    }

    public static void task13() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0)
                task13();
        }
    }

    public static String task14(int n) {

        if (n < 10)
            return Integer.toString(n);
        else
            return task14(n / 10) + " " + n % 10;
    }

    public static int task15(int n) {
        if (n < 10)
            return n;
        else {
            System.out.print(n % 10 + " ");
            return task15(n / 10);
        }
    }

    public static void task16(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max)
                task16(n, 1);
            else if (n == max)
                task16(max, ++count);
            else
                task16(max, count);
        }
        else
            System.out.println(count);

    }

    public static int task17() {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n == 0)
            return 0;
        else
            return Math.max(n, task17());

    }

    public static void main(String[] args) {

        System.out.println("Треугольная последовательность");
        task1(12);
        System.out.println();

        System.out.print("От 1 до n");
        System.out.println("\n" + task2(5));

        System.out.println("От A до B");
        System.out.println(task3(5, 25));

        System.out.println("Заданная сумма цифр");
        System.out.println(task4(0, 0, 3, 15));

        System.out.println("Сумма цифр числа");
        System.out.println(task5(120));

        System.out.println("Проверка числа на простоту");
        System.out.println(task6(36, 2));

        System.out.println("Разложение на множители");
        task7(150, 2);
        System.out.println();

        System.out.println("Палиндром");
        System.out.println(task8("rotor"));

        System.out.println("Без двух нулей");
        System.out.println(task9(5, 8));

        System.out.println("Разворот числа");
        System.out.println(task10(234, 0));

        System.out.println("Количество единиц");
        System.out.println(task11());

        System.out.println("Вывести нечетные числа последовательности");
        task12();
        System.out.println();

        System.out.println("Вывести члены последовательности с нечетными номерами");
        task13();
        System.out.println();

        System.out.println(" Цифры числа слева направо");
        System.out.println(task14(421));

        System.out.println("Цифры числа справа налево");
        System.out.println(task15(123));

        System.out.println("Количество элементов, равных максимуму");
        task16(0,0);
        System.out.println();

        System.out.println("Максимум последовательности");
        System.out.println(task17());

    }
}