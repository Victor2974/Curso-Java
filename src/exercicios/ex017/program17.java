package exercicios.ex017;

//Given an int array length 2, return true if it does not contain a 2 or 3.


//no23([4, 5]) → true
//no23([4, 2]) → false
//no23([3, 5]) → false



public class program17 {
    public static void main(String[] args) {

        int[] nums = {4,3};

        for (int i = 0; i < 2 ; i++) {
            if (nums[i] == 2 || nums[i] == 3){
                System.out.print(false);
            }

        }
    }
}
