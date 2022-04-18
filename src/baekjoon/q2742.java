package baekjoon;

import java.util.Scanner;

public class q2742 {
    public static void main(String[] args) {
        //자연수 a 가 주어졌을때 a~1까지 아래차순으로 출력
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = a; i>0; i--) {
            System.out.println(i);
        }
    }
}
