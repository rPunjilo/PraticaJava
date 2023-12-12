import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.print("Digite a nota: ");
        nota = sc.nextInt();
        
        while (nota < 0 | nota > 10){
            System.out.print("A nota foi digitada incorretamente, digite novamente: ");
            nota = sc.nextInt();
        }
        System.out.printf("A sua nota é %d%n", nota);
        System.out.println("Obrigado");
        sc.close();
    }
    
}
