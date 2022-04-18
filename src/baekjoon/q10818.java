package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class q10818 {
    public static void main(String[] args) {
        //최솟값 최댓값
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] arr = new int[t];

        for (int i =0; i<t; i++) {
           arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[t-1]);
    }
}
