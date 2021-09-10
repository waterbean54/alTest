package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10818 {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arrData = br.readLine().split(" ");
        int min = Integer.parseInt(arrData[0]);
        int max = Integer.parseInt(arrData[0]);

        for(int i=0; i < num; i++){
            int intNum = Integer.parseInt(arrData[i]);
            if(intNum < min){
                min = intNum;
            }else if(intNum > max){
                max = intNum;
            }
        }

        System.out.println(min + " " + max);


    }

}
