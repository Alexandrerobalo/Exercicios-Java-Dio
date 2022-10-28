/*Crie um vetor de 6 númeors e mostre-os na ordem reversa.

 */
public class Ex1_arrays {

    public static void main(String[] args) {

        int[] vetor = {-5,-6, 15, 50, 8, 4 };

        System.out.println("Vetor:");
        int contador = 0;
        while (contador < (vetor.length)){
            System.out.print (vetor [contador]+ " ");
            contador++;
        }
        System.out.print("\n vetor:");
          for (int i = (vetor.length -1) ; i>= 0; i --){
            System.out.print (vetor [i ]+ " ");
        }


    }

}


