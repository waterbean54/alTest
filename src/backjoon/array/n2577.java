package backjoon.array;

import java.util.Scanner;

public class n2577 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int[] counts = new int[10];
        int number = A * B * C;
        while (number > 0) {
            counts[number % 10]++; //나머지
            number /= 10; //나눈 몫
        }

        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
    }

    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = br.readLine() * br.readLine() * br.readLine();

        String[] strArr = String.valueOf(result).split("");
        int zero=0;int one=0;int two=0;int three=0;int four=0;int five=0;int six=0;int seven=0; int eight=0;int nine=0;
        for(int i=0; i<strArr.length;i++){
            switch(Integer.parseInt(strArr[i])){
                case 0 :
                    zero++;
                    break;
                case 1 :
                    one++;
                    break;
                case 2 :
                    two++;
                    break;
                case 3 :
                    three++;
                    break;
                case 4 :
                    four++;
                    break;
                case 5 :
                    five++;
                    break;
                case 6 :
                    six++;
                    break;
                case 7 :
                    seven++;
                    break;
                case 8 :
                    eight++;
                    break;
                case 9 :
                    nine++;
                    break;
            }
        }

        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);

    }*/
}
