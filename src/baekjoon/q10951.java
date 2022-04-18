package baekjoon;

import java.util.Scanner;

public class q10951 {
    public static void main(String[] args) {
        //각케이스 마다 a+b를 출력
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {

            int a = sc.nextInt();
            int b = sc.nextInt();

                System.out.println(a+b);
        }
    }
}
