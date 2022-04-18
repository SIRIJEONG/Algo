package baekjoon;

import java.util.Scanner;

public class q1008 {
    public static void main(String[] args) {
        //두 정수 A와 B를 입력받은 다음, A/B를 출력
        Scanner sc = new Scanner(System.in);
        double a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a/b);
    }
}
