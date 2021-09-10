package chap3;

import java.util.Scanner;

public class ch4 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");
        System.out.print("x[0] :");
        x[0] = stdIn.nextInt();

        for(int i=1; i<num; i++){
            do{
                System.out.print("x["+i+"] : ");
                x[i] = stdIn.nextInt();
            }while(x[i]<x[i-1]); // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.println("검색할 값 : ");
        int key = stdIn.nextInt();

        int idx = binsearch(x,num,key);

        if(idx == -1){
            System.out.println("요소 없음");
        }else{
            System.out.println(key+"값은 x["+idx+"] 에 있습니다.");
        }
    }

    static int binsearch(int[] a, int n, int key){
        int pl=0; //검색 범위의 첫 인덱스
        int pr=n-1; //검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; //중앙 요소의 인덱스
            if (a[pc] == key) {
                return pc; //검색 성공
            } else if (a[pc] < key) {
                pl = pc + 1; //검색 범위 좁히기
            } else {
                pr = pc - 1; //검색 범위를 앞쪽 절반으로 좁힘
            }
        }while(pl<=pr);

        return -1; //검색 실패
        }


}
