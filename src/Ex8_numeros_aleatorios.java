
/*Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os numeros e seus succesores.
 */

import java.util.Random;

public class Ex8_numeros_aleatorios {

    public static void main(String[] args) {

        Random  randon = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i= 0; i< numerosAleatorios.length;i++  ) {
            int numero = randon.nextInt(100);
            numerosAleatorios[i] = numero;

        }
        System.out.print("Numeros Aleatórios:");
        for (  int numero  : numerosAleatorios) {
            System.out.print(numero + "");

        }
        System.out.print("\n Sucessores do números aleatórios:");
        for (int numero: numerosAleatorios) {
            System.out.print((numero + 1) + "");

        }



    }










}
