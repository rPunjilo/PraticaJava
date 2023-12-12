import java.util.Scanner;
public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, expo, i,base2;

        System.out.print("Digite o valor da base: ");
        base = sc.nextInt();
        System.out.print("Digite o valor do expoente: ");
        expo = sc.nextInt();
        base2 = base;

        for(i=1; i<expo; i++){
            base *= base2;
            System.out.println(base);
        }
        sc.close();
    }
    
}
