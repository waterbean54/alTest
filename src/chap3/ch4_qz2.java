package chap3;

import java.util.Scanner;

public class ch4_qz2 {

        //요솟수가 n인 배열 a에서 key와 같은 요소를 선형 검색 합니다.
        static int seqSearch(int[] a, int n, int key){
            int i=0;
            a[n] = key;
            while(true){
                for(int k=0; k<=n;k++){
                    if(k==i){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                    System.out.printf("%3d",a[k]);
                }
                System.out.println("");

                if(a[i]==key){
                    break; //검색 성공
                }
                i++;
            }
            return i==n?-1:i;
        }

        public static void main(String[] args) {
            int num = 10;
            int[] x = new int[num+1];
            int key = 5;

            for(int i=0; i<num; i++){
                x[i] = i+1;
            }

            int idx = seqSearch(x,num,key);

            if(idx==-1){
                System.out.println("요소 없음");
            }else{
                System.out.println(key+"는 x["+idx+"] 에 있습니다.");
            }

        }

}
