package baekjoon;

import java.util.Scanner;

public class q11021 {
    public static void main(String[] args) {
        // 케이스 개수 t개 가 주어지고 a+b를 입력하였을때  각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 1; i<=t; i++) {
int a = sc.nextInt();
int b = sc.nextInt();
            System.out.println("Case #" + i + ": " + (a+b));
        }
    }
}
