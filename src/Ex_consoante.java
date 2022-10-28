/*Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes forma lidas.
Imprima consoantes.
 */


import java.util.Scanner;

public class Ex_consoante {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String[] consoantes = new  String[6];
        int quantidadeConsoantes = 0;

        int contador = 0;
        do {
            System.out.println("letra:");
            String letra = Scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
             letra.equalsIgnoreCase("e")|
             letra.equalsIgnoreCase("o")|
             letra.equalsIgnoreCase("u"))){

                consoantes[contador]= letra;
                quantidadeConsoantes++;
            }
              contador++;

        } while (contador < consoantes.length);

        System.out.println("consoantes:");

        for (String consoante  : consoantes   ){

            if (consoante != null)

            System.out.println(consoante + "");

            System.out.println("Quantidade de consoantes" + quantidadeConsoantes);




        }


    }




}
