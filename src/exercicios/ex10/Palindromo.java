package exercicios.ex10;

public class Palindromo {

    public static void main(String[] args){

        int x=101;
        char[] digitos = String.valueOf(x).toCharArray();
        boolean palindromo = true;
        int j = digitos.length-1;


        for(char digito : digitos){
            if(digito == digitos[j]){
                j--;
            }else{
                palindromo = false;
                break;
            }
        }
        System.out.print(palindromo);


    }
}
