import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();

        if (a < 0){
            System.out.println("Negativo");
        }
        else if (a > 0){
            System.out.println("Positivo");
        }
        else {
            System.out.println("Vai se fuder");
        }
    }
}
