package backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeatNum = Integer.parseInt(br.readLine());
        while(repeatNum-- > 0){
            String result = "NO";
            String[] strArr = br.readLine().split("");
            String[] stackArr = new String[strArr.length];

            int num = 0;
            for(int i=0; i < strArr.length; i++){
                if(strArr[i].equals(")")){
                    if(i!=0 && stackArr[num-1].equals("(")){
                        result = "YES";
                        --num;
                    }
                    break;
                }else{
                    stackArr[num++] = strArr[i];
                }

                if(num!=0){
                    result="NO";
                    break;
                }
            }
            System.out.println(result);
        }

    }

}
