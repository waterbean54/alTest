package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int max = 0;
        int maxNum = 0;

        for(int i=1; i<10; i++){
            int arrNum = Integer.parseInt(br.readLine());
            if(i==0){
                arr[0] = arrNum;
            }else if(arrNum > max){
                max = arrNum;
                maxNum = i;
            }
        }

        System.out.println(max);
        System.out.println(maxNum);
    }
}
