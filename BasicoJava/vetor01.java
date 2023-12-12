import java.util.Scanner;
public class vetor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(i=0; i<5; i++){
            System.out.printf("Qual é o elemento %d? ", i+1);
            vetorA[i] = sc.nextInt();
        }

        vetorB = vetorA;

        for(i=0; i<5; i++){
            System.out.printf("O elemento %d é: %d\n", i+1, vetorB[i]);
        }

        sc.close();
    }
}
