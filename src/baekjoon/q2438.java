package baekjoon;

import java.util.Scanner;

public class q2438 {
    public static void main(String[] args) {
        //첫번쨰 줄부터 n번쨰 줄까찌 차례대로 별 출력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
