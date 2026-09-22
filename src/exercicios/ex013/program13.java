package exercicios.ex013;

public class program13 {

    public static void main(String[] args) {
        
        int[] list1 = {1, 2, 4};
        int[] list2 = {1,3,4};
        int[] result = new int[list1.length+list2.length];

        for (int i = 0; i < list1.length; i++) {
            result[i] = list1[i];
            if (i == list1.length-1){
                for (int j = 0; j < list2.length; j++) {
                    result[i+j+1] = list2[j];
                }
            }
        }
        
    }
}
