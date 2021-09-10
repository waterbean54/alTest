package backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            String result = "yes";
            String[] strArr = br.readLine().split("");
            String[] arr = new String[strArr.length];
            int num = 0;

            if(strArr[0].equals(".")){
                break;
            }else{
                for(int i=0; i < strArr.length; i++){
                    if(strArr[i].equals("(")){
                        arr[num++] = "(";
                    }else if(strArr[i].equals("[")){
                        arr[num++] = "[";
                    }else if(strArr[i].equals(")")){
                        if(num <= 0){
                            result = "no";
                            break;
                        }
                        if(arr[num-1] != "("){
                            result = "no";
                            break;
                        }else{
                            --num;
                        }
                    }else if(strArr[i].equals("]")) {
                        if(num <= 0){
                            result = "no";
                            break;
                        }
                        if (arr[num - 1] != "[") {
                            result = "no";
                            break;
                        } else {
                            --num;
                        }
                    }
                }
            }

            if(num!=0){
                result="no";
            }

            System.out.println(result);
        }

    }

}
