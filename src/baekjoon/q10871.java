package baekjoon;

import java.util.Scanner;

public class q10871 {
    public static void main(String[] args) {
        //첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
        //
        //둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
        //x 보다 작은 수를 출력
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i<n; i++ ) {
              arr[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++) {
            if (arr[i]<x) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
