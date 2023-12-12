//Leia uma matriz 5 x 6 que se refere respostas de 6 questoes de multipla escolha,
//referentes a 5 alunos. Leia tambem um vetor de 6 posicoes contendo o gabarito de 
//respostas que podem ser a, b, c ou d. Seu programa devera comparar as respostas ´
//de cada candidato com o gabarito e emitir um vetor denominado resultado, contendo a
//pontuac¸ao correspondente a cada aluno.

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int i, j, numAluno=2;
        String respostas[][] = new String[numAluno][6];
        String alternativa;
        String gabarito[] = {"A", "E", "C", "D", "C", "B"};
        String resultado[][] = new String[5][1];
        int certo=0;
        String nome[] = new String[numAluno];

        for(i=0; i<numAluno; i++){
            System.out.printf("Qual o nome do aluno %d? ", i+1);
            nome[i] = sc.next();
            for(j=0; j<6; j++){
                do{
                    System.out.printf("Qual a resposta da pergunta %d? ", j+1);
                    alternativa = sc.next().toUpperCase();
                    if(!alternativa.equals("A") && !alternativa.equals("B") &&
                    !alternativa.equals("C") && !alternativa.equals("D") && !alternativa.equals("E")){
                        System.out.println("Resposta não conforme!!!");
                    }
                }while(!alternativa.equals("A") && !alternativa.equals("B") &&
                !alternativa.equals("C") && !alternativa.equals("D") && !alternativa.equals("E"));
                respostas[i][j] = alternativa;
            }
        }

        for(i=0; i<numAluno; i++){
            for(j=0; j<6; j++){
                if(respostas[i][j].equals(gabarito[j])){
                    certo++;
                }
            }
            for(j=0; j<1; j++){
                resultado[i][j] = Integer.toString(certo);
            }
            certo = 0;
        }

        
        for(i=0; i<numAluno; i++){
            for(j=0; j<1; j++){
                System.out.printf("O aluno %s acertou %s questões\n", nome[i], resultado[i][j]);
            }
        }

        sc.close();
    }
}
