package JAVA.Homework_seminar_1;
import java.util.Scanner;

public class Task_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Написать программу вычисления n-ого треугольного числа.
        int numb = getNumberByUser("Ведите целое число: ");
        int calc = caculation(numb);
        print2(numb, calc);
    }

    public static int getNumberByUser(String text) {
        System.out.println(text);
        return input.nextInt();
    }

    public static int caculation(int n) {
        int res = (n * (n + 1) / 2);
        return res;

    }

    public static void print2(int numb, int calc){
        
        System.out.printf("%d-угольное треугольное число = %d ", numb, calc);

    }

  

}
