import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usuario, senha, usuario_1 = 123456, senha_1 = 221133;
        
        System.out.print("Digite o usuário: ");
        usuario = sc.nextInt();
        System.out.print("Digite a senha: ");
        senha = sc.nextInt();
        while (usuario != usuario_1 | senha != senha_1){
            System.out.println("Usuário e/ou senha incorretos");
            System.out.print("Digite o usuário: ");
            usuario = sc.nextInt();
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
        }
        System.out.print("Seja bem vindo!");
        sc.close();
        
    }
    
}
