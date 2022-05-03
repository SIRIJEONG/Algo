package baekjoon;

import java.util.Scanner;

public class q2577 {
    public static void main(String[] args) {
        //곱한 수 0~9까지 나온 숫자 갯수 출력하기
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] sum = new int[10];
        int d = a * b * c;

        while (d > 0) {
            sum[d % 10]++;
            d /=10;
        }
        for (int i = 0; i<sum.length; i++ ) {
            System.out.println(sum[i]);
        }
    }
}ㄴ
