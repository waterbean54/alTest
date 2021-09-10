package chap2;

public class ch02 {
    public static void main(String[] args) {
        int[] array = {1,41,2,35,12};
        reverseArray(array);
    }

    //배열을 역순으로 정렬.
    public static void reverseArray(int[] array){



        for(int i=0; i<array.length; i++){
            array[i] = array[array.length-1-i];
            swap(array,i,0);
        }
        System.out.println("정렬 완료");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void swap(int[] a, int idx1, int idx2){

    }
}
