package baekjoon;

import java.util.Scanner;

public class q2525 {
    public static void main(String[] args) {
        //현재시각 과 원하는 추가시간 을 입력했을때 추가한 시간만큼의 시와분을 출력
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a = h*60 + m + n;
        h = a/60;
        m = a%60;

        if(h>=24) {
            h=h-24;
        }
        System.out.println(h + " " + m);
    }
}
