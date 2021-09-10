package backjoon.array;

import javax.swing.plaf.IconUIResource;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        while(num-- > 0){
            String[] arr = br.readLine().split("");
            int continuity = 0;
            int result = 0;

            for(String ox : arr){
                if(ox.equals("O")){
                    if(continuity>0){
                        result += continuity+1;
                    }else{
                        result++;
                    }
                     continuity++;
                }else{
                    continuity = 0;
                }
            }

            System.out.println(result);

        }
    }

}
