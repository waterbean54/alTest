package backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n10828 {

    private static int num;
    private static int max;
    private static int[] arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        max = Integer.parseInt(br.readLine());

        arr = new int[max];

       while(max-- >0){
           st = new StringTokenizer(br.readLine(), " ");

           switch (st.nextToken()) {
               case "push":
                   push(Integer.parseInt(st.nextToken()));
                   break;
               case "pop":
                   System.out.println(pop());
                   break;
               case "size":
                   System.out.println(size());
                   break;
               case "empty":
                   System.out.println(empty());
                   break;
               case "top":
                   System.out.println(top());
                   break;
           }
       }

    }

    static void push(int x){
        arr[num++] = x;
    }

    static int pop(){
        if(num <= 0){
            return -1;
        }
        return arr[--num];
    }

    static int size(){
        return num;
    }

    static int empty(){
        return num==0?1:0;
    }

    static int top(){
        return num<=0?-1:arr[num-1];
    }

}
