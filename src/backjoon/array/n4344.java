package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        while(a-- > 0){
            String[] arr = br.readLine().split(" ");
            int wholeNum = Integer.parseInt(arr[0]);
            int sum=0;
            for(int i=1; i<arr.length;i++){
                sum+=Integer.parseInt(arr[i]);
            }
            //평균 구하기
            int count = 0;
            double average = sum/wholeNum;
            //평균보다 더 높은 값 개수 구하기
            for(int i=1; i<arr.length;i++){
                if(Integer.parseInt(arr[i]) > average){
                    count++;
                }
            }
            System.out.println(String.format("%.3f",(double)100*count/wholeNum)+"%");


        }

    }
}
