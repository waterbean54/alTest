package chap1;

public class ch01_q01 {
    public static void main(String args[]){
        System.out.println(max4(1,2,3,4));
        System.out.println(max4(15,2,32,41));
        System.out.println(min3(1,2,3));
        System.out.println(min3(5,33,2));
    }

    public static int max4(int a, int b, int c, int d){

        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        if(c>max){
            max = c;
        }
        if(d>max){
            max = d;
        }

        return max;
    }

    public static int min3(int a, int b ,int c){

        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        return min;
    }

}
