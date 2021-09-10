package backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1546 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int max = Integer.parseInt(arr[0]);

        //제일 큰 수 구하기
        for(int i=0; i<n;i++){
            if(max<Integer.parseInt(arr[i])){
                max = Integer.parseInt(arr[i]);
            };
        }

        double result = 0;

        //새로 계산하기
        for(int i=0; i<n;i++){
            int data = Integer.parseInt(arr[i]);
            result += (double)data/max*100;
        }

        System.out.println(result / n);
    }

}
