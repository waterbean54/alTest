package chap1;

//구구단 9단까지 출력
public class ch07 {
    public static void main(String[] args) {
        getMultiplicationFormatTable();
    }

    public static void getMultiplicationTable(){
        System.out.println("---- 곱셈표 -----");
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.printf("%3d", i*j);
            }
            System.out.println("");
        }
    }

    public static void getMultiplicationFormatTable(){
        System.out.println("-------------------- 곱셈표 --------------------");
        System.out.printf("   |");
        for(int i=1; i<=9; i++){
            System.out.printf("%3d",i);
        }
        System.out.println("\n---+---------------------------");

        for(int i=1; i<=9; i++){
            System.out.printf("%2d", i);
            System.out.printf(" |");
            for(int j=1; j<=9; j++){
                System.out.printf("%3d", i*j);
            }
            System.out.println("");
        }
    }
}
