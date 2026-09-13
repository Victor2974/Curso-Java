package exercicios.ex9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum2 {

    public static void main(String[] args){

        int[] nums = {2,7,11,15};
        int target = 9;
        int j = nums.length-1;
        int i = 0;

        Arrays.sort(nums);

        for (int num : nums) {
            int soma = nums[i] + nums[j];
            if (soma == target) {
                System.out.printf("[%d,%d]%n",i,j);
                i++;
            } else if (soma > target) {
                j--;
            }else{
                i++;
            }
        }
    }
}