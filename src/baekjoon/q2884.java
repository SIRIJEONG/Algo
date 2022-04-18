package baekjoon;

import java.util.Scanner;

public class q2884 {
    public static void main(String[] args) {
        //h시 m분 을 입력했을때 45분을 일찍 울리게 할수있는 프로그램 출력
        Scanner sc = new Scanner(System.in);
        int H,M;
        H=sc.nextInt();
        M=sc.nextInt();
        if (M<45){
            H--;
            M=60-(45-M);

            if (H<0) {
                H=23;
            }
            System.out.println((H + " " + M));
        }else  {
            System.out.println(H + " " + (M-45));
        }
    }
}
