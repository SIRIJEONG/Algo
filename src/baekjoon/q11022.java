package baekjoon;

import java.util.Scanner;

public class q11022 {
    public static void main(String[] args) {
        //케이스 개수 t개 가 주어지고 a+b를 입력하였을때  Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i<=t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
        }

    }
}
