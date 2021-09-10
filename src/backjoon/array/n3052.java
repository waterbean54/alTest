package backjoon.array;

import java.util.Scanner;

public class n3052 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];

        for(int i=0; i<10;i++){
            arr[sc.nextInt()%42] = 1;
        }
        sc.close();

        int count = 0;
        for(int a:arr){
            if(a == 1){
                count++;
            }
        }

        System.out.println(count);


    }
}
