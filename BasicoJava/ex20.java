import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0, n;

        System.out.print("Qual número você deseja ver a tabuada? ");
        n = sc.nextInt();
        System.out.printf("Tabuada do %d:%n", n);

        for (i=0; i<11; i++){
            System.out.printf("%d x %d = %d%n", n, i, n*i);
        }
        sc.close();
    }
}
