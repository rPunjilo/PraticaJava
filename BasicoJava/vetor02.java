import java.util.Scanner;
public class vetor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, quantidade;

        System.out.print("Quantos alunos participaram? ");
        quantidade = sc.nextInt();

        String[] nomeVetor = new String[quantidade];
        double[] nota1 = new double[quantidade];
        double[] nota2 = new double[quantidade];

        for(i=0; i<quantidade; i++){
            System.out.printf("Qual é o nome do aluno %d? ", i+1);
            nomeVetor[i] = sc.next();
            System.out.printf("Qual é a primeira nota do aluno %s? ", nomeVetor[i]);
            nota1[i] = sc.nextDouble();
            System.out.printf("Qual é a segunda nota do aluno %s? ", nomeVetor[i]);
            nota2[i] = sc.nextDouble();
        }
        sc.close();
    }
}
