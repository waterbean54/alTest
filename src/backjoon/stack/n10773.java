package backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        int[] arr = new int[k];
        int num = 0;

        while(k-- > 0){
            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                --num;
            }else{
                arr[num++] = n;
            }
        }

        int result = 0;
        for(int i=0; i<num; i++){
            result += arr[i];
        }

        System.out.println(result);

    }


}
