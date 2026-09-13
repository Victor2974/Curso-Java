package exercicios.ex8;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] nums = {3,2,4};
        int target = 6;

        for(int i=0;i<nums.length;i++){
            for(int g=i+1;g< nums.length;g++){
                if(nums[i]+nums[g]==target){
                    System.out.printf("[%d,%d]%n",i,g);
                }
            }
        }

        sc.close();

    }
}
