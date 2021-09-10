package chap1;

public class ch08 {
    //직각 이등변 삼각형 출력
    public static void main(String[] args) {
        printTriangleB(5);
    }

    static void printTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    static void printTriangleB(int n){
        for(int i=1; i<=n; i++){
            for(int k=0;k <= n; k++){
                System.out.println(k);
                System.out.printf(" ");
            }
            for(int j=1; j<=(i-1)*2+1; j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

}
