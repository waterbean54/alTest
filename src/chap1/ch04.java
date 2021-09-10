package chap1;

public class ch04 {
    //1부터 n까지의 정수 합 구하기
    public static void main(String[] args) {
        System.out.println(sumof(3,5));
    }

    public static int whilePlus(int n){

        int result = 0;
        int i = 1;

        while(i <= n){
            result = result + i;
            i++;
        }

        return result;
    }
    public static int forPlus(int n){

        int result = 0;

        for(int i=1; i<=n; i++){
            result = result + i;
        }

        return result;
    }

    public static int sumof(int a, int b){

        int min=0;
        int max=0;

        if(a>b){
            min = b;
            max = a;
        }else{
            min = a;
            max = b;
        }

        int result = 0;

        for(int i = min; i <= max; i++){
            result += i;
        }

        return result;
    }
}
