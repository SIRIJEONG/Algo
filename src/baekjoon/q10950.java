package baekjoon;

import java.util.Scanner;

public class q10950 {
    public static void main(String[] args) {
        //케이스 개수를 정해놓고 a+b 구하기
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i<t; i++ ) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}
