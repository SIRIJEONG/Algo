package baekjoon;

import java.util.Scanner;

public class q10869 {
    public static void main(String[] args) {
        //두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
