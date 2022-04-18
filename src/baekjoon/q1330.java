package baekjoon;

import java.util.Scanner;

public class q1330 {
    public static void main(String[] args) {
        //두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오. a와b는 공백 한칸 으로 구분되어져있음
        Scanner sc = new Scanner(System.in);

        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a>b) System.out.println(">");
        else if (a<b) System.out.println("<");
        else System.out.println("==");
    }
}
