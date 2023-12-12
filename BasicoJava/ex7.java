import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media;

        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextFloat();
        media = (n1 + n2) / 2;

        if (media >= 7 & media <= 9){
            System.out.println("Aprovado");
        }
        else if (media == 10){
            System.out.println("Aprovado com distinção");
        }
        else{
            System.out.println("Reprovado");
        }
        sc.close();
    }
}
