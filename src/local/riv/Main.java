package local.riv;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        println("Алгоритм Евклида (вычисление НОД)");
        println("Входные данные");
        print("p = ");
        int p = in.nextInt();
        print("q = ");
        int q = in.nextInt();
        println("Результат");
        println(gcb(p, q));

        long finishTime = System.currentTimeMillis();
        long timeConsumed = finishTime = startTime;

        println("Прошло времени");
        println(timeConsumed);
    }

    public static void print(Object obj) {
        System.out.print(obj);
    }

    public static void println(Object obj)
    {
        System.out.println(obj);
    }

    public static int gcb(int p, int q)
    {
        if (q == 0) {
            return p;
        }

        int r = p % q;

        return gcb(q, r);
    }
}
