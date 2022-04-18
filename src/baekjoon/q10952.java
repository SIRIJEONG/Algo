package baekjoon;

import java.util.Scanner;

public class q10952 {
    public static void main(String[] args) {
        //각케이스 마다 a+b를 출력 0+0이 입력되는 순간 출력끝
        Scanner sc = new Scanner(System.in);
        while (true) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0) {
                break;
            }
            System.out.println(a+b);
        }
    }
}
