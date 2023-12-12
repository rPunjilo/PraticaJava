package ex30;
//Gere e imprima uma matriz 4x4 com valores aleatórios entre 0 e 100. Após isso, determine o maior
//numeroda matriz e a sua posição (linha,coluna);


import java.util.Scanner;
import java.util.Random;

public class ex30 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i, j, numero, linha=0, coluna=0, maior=0;
       int matriz[][] = new int[4][4];
       Random gerador = new Random();

       for(i=0; i<4; i++){
        for(j=0; j<4; j++){
            numero = gerador.nextInt(100);
            matriz[i][j] = numero;
            if(matriz[i][j] > maior){
                maior = matriz[i][j];
                coluna = i;
                linha = j;
            }
        }
       }
       for(i=0; i<4; i++){
        for(j=0; j<4; j++){
            System.out.printf("%d\n", matriz[i][j]);
        }
       }

       System.out.printf("O maior número é %d, na coluna %d e na linha %d", maior, coluna, linha);
       sc.close();
    }
}
