import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        b = sc.nextInt();

        if (a > b){
            System.out.println(a + " é maior que " + b);
        }
        else if (a < b){
            System.out.println(b + " é maior que " + a);
        }
        sc.close();
    }
    
}
