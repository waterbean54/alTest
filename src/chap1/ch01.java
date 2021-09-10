package chap1;

import java.util.Scanner;

public class ch01 {

    //최대값 구하기
    //순차적 구조 + if문의 선택 구조

    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 = ");
        int a = stdIn.nextInt();
        System.out.println("b의 값 = ");
        int b = stdIn.nextInt();
        System.out.println("c의 값 = ");
        int c = stdIn.nextInt();

        int max = a;

        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println("max 값 = " + max);

    }

}
