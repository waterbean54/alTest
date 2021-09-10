package chap1;

public class ch01C {

    public static void main(String args[]){
        System.out.println(med3(1,5,2));
    }

    static int med3(int a,int b, int c){

        if (a>=b){
            if(b>=c){
                return b;
            }else if(a <= c){
                return a;
            }else{
                return c;
            }
        }else if(a>c){ // b>a>c
            return a;
        }else if(b>c){ //b>c>a
            return c;
        }else{ // b<c, a<c, a<=b -> a<b<c
            return b;
        }

    }
}
