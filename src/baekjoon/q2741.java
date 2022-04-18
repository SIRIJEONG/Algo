package baekjoon;

import java.util.Scanner;

public class q2741 {
    public static void main(String[] args) {
        // 자연수 a가 주어졌을때 아래차순으로 1~a 출력
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i<=a; i++) {
            System.out.println(i);
        }
    }
}
