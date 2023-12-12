import java.util.Scanner;
public class ex19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n,x;

        do{
            System.out.print("Digite o primeiro número: ");
            x = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            n = sc.nextInt();
        }while(x > 100 || n > 100);
        
        if (x > n){
            for (i=n-1; i<x; i++){
                System.out.println(i);
            }
        }
        for (i=x+1; i<n; i++){
            System.out.println(i);
        }
        sc.close();
    }
    
}
