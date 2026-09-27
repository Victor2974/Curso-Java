package exercicios.ex018;

//Dado um array int de comprimento 3, se houver um 2 no array imediatamente seguido por um 3, defina o elemento 3 em 0. Devolva o array alterado.


//fix23([1, 2, 3]) → [1, 2, 0]
//fix23([2, 3, 5]) → [2, 0, 5]
//fix23([1, 2, 1]) → [1, 2, 1]


import java.util.Arrays;

public class program18 {

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == 2 && i+1 < nums.length){
                if (nums[i+1] == 3){
                    nums[i+1] = 0;
                }
            }

        }
     System.out.print(nums[2]);
    }

}
