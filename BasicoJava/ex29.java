import java.util.Scanner;
public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j, quantidade;

        System.out.print("Quantos alunos participaram? ");
        quantidade = sc.nextInt();

        String[] nomeVetor = new String[quantidade];
        double[][] notas = new double[quantidade][2];

        for(i=0; i<quantidade; i++){
            System.out.printf("Qual é o nome do aluno %d? ", i+1);
            nomeVetor[i] = sc.next();
            for(j=0; j<2; j++){
                System.out.printf("Qual é a nota %d do aluno %s? ",(j+1), nomeVetor[i]);
                notas[i][j] = sc.nextDouble();
            }
        }

        for(i=0; i<quantidade; i++){
            System.out.printf("O nome do aluno %d é: %s\n", i+1, nomeVetor[i]);
            for(j=0; j<2; j++){
                System.out.printf("A nota %d do aluno %s é %.1f\n", (j+1), nomeVetor[i], notas[i][j]);
            }
        }

        sc.close();
    }
}
