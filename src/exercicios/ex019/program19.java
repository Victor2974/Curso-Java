package exercicios.ex019;

/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */

public class program19 {

    public static void main(String[] args) {

        int[] a = {};
        int[] b = {1,2,3};

        int[] r = new int[2];

        if(a.length > 1){
            r[0] = a[0];
            r[1] = a[1];
        }else if (a.length == 1) {
            r[0] = a[0];
            r[1] = b[0];
        }else{
            r[0] = b[0];
            r[1] = b[1];
        }
        System.out.print(r[0]);
        System.out.print(r[1]);

    }
}
