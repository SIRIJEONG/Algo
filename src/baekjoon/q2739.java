package baekjoon;

import java.util.Scanner;

public class q2739 {
    public static void main(String[] args) {
        //구구단
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        for (int i = 1; i<10; i++ ) {
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
