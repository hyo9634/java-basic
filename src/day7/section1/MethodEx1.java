package day7.section1;

import java.util.Scanner;

public class MethodEx1 {
    // 주사위 프로그램을 여러명이 참여하여 차례로 한번씩 주사위를 던질 수 있도록 제공하는 프로그램
    public static void main(String[] args) {
        MethodEx1 mex1 = new MethodEx1();
        for(int i = 0; i<3;i++){
            int n = mex1.playerSetting();
            mex1.dicePlay(n);
        }
    }

    int playerSetting(){
        System.out.print("참여자의 인원수를 입력해 주세요");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }


    void dicePlay(int n) {

        for (int i = 1; i <= n; i++) {

            int num = (int) (Math.random() * 6) + 1;

            if (num == 1) {
                System.out.println("1번이 나왔습니다.");
            } else if (num == 2) {
                System.out.println("2번이 나왔습니다.");
            } else if (num == 3) {
                System.out.println("3번이 나왔습니다.");
            } else if (num == 4) {
                System.out.println("4번이 나왔습니다.");
            } else if (num == 5) {
                System.out.println("5번이 나왔습니다.");
            } else {
                System.out.println("6번이 나왔습니다.");
            }
        }

    }


}
