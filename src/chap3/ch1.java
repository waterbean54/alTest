package chap3;

import java.util.Scanner;

public class ch1 {

    //요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색 합니다.
    static int seqSearch(int[] a, int n, int key){
        int i=0;
        while(true){
            if(i==n){ //요소의 끝까지 가면 검색 실패
                return -1;
            }
            if(a[i]==key){
                return i; //검색 성공
            }

            i++;
        }
    }

    static int seqSearchFor(int[] a, int n, int key){
        for(int i=0; i<n; i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("요솟수:");
        int num = stdIn.nextInt();
        int[] x = new int[num]; //배열 크기 지정

        for(int i=0; i<num; i++){
            System.out.println("x["+i+"]");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값 : ");
        int key = stdIn.nextInt();

        int idx = seqSearchFor(x,num,key);

        if(idx==-1){
            System.out.println("요소 없음");
        }else{
            System.out.println(key+"는 x["+idx+"] 에 있습니다.");
        }

    }

}
