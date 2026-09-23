package exercicios.ex016;


//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


//doubleX("axxbb") → true
//doubleX("axaxax") → false
//doubleX("xxxxx") → true



public class program16 {

    public static void main(String[] args) {

        String doubleX = "axxbb";

        for(int i=0; i < doubleX.length(); i++){
            int a = doubleX.indexOf('x');

            if(doubleX.charAt(i) == 'x'){
                if(doubleX.charAt(i+1) == 'x'){
                    System.out.print(true);
                }
            }
        }

    }
}
