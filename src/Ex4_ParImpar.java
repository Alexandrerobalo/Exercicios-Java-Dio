import java.util.Scanner;

public class Ex4_ParImpar {
   /*Faça um programa que peça N números inteiros,
   calcule e mostre a quantidade de números pares
   e a quantidade de números impares.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int contador= 0;
        int numero;
        int quantPar = 0;
        int quantImpar = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        do {

            System.out.println("Numero:");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) quantPar++ ;
            else quantImpar++;


            contador = contador + 1;
        } while (contador < quantNumeros );

        System.out.println("Quantidade Par:" + quantPar);
        System.out.println("Quantidade impar"+ quantImpar);






    }


}
