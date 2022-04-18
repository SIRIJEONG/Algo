package baekjoon;

import java.util.Scanner;

public class q2439 {
    public static void main(String[] args) {
        //첫번째 줄부터 n번째 줄까지 차례대로 별을 출력하는데 오른쪽 정렬한 별을 출력 
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i<=a; i++) {
            for (int j = 1; j<=a-i; j++){
                System.out.print(" ");
            }
            for (int b = 0; b < i; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
