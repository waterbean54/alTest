package chap3;

import java.util.Scanner;

public class ch3 {

    //요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색 합니다.
    static int seqSearch(int[] a, int n, int key){
        int i=0;

        a[n] = key;

        while(true){
            if(a[i]==key){
                break; //검색 성공
            }
            i++;
        }

        return i==n?-1:i;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요솟수:");
        int num = stdIn.nextInt();
        int[] x = new int[num+1]; //배열 크기 지정

        for(int i=0; i<num; i++){
            System.out.println("x["+i+"]");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값 : ");
        int key = stdIn.nextInt();

        int idx = seqSearch(x,num,key);

        if(idx==-1){
            System.out.println("요소 없음");
        }else{
            System.out.println(key+"는 x["+idx+"] 에 있습니다.");
        }

    }


}
