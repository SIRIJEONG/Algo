package baekjoon;

import java.util.Scanner;

public class q8393 {
    public static void main(String[] args) {
        //n 이 주어졌을때 1~n의 합 구하는 프로그램
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int sum = 0;

        for (int i = 1; i<=a; ++i ) {
            sum += i;
        }
        System.out.println(sum);
    }
}
