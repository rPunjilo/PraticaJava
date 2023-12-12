import java.util.Scanner;
public class ex14
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
        char sexo, est_civil;
		
		do{
		    System.out.print("Digite o nome do funcionário: ");
		    nome = sc.nextLine();
		    if (nome.length() <= 3){
		        System.out.println("Quantidade miníma de caracteres é a partir de 4");
		    }
		}while (nome.length() <= 3);
		
		do{
		    System.out.print("Digite a idade do funcionário: ");
		    idade = sc.nextInt();
		    if (idade < 0 | idade > 100){
		        System.out.println("Idade incorreta");
		    }
		}while(idade < 0 | idade > 100);

        do{
            System.out.print("Digite o valor do salário do funcionário: ");
            salario = sc.nextDouble();
            if (salario < 0){
                System.out.println("Valor incorreto");
            }
        }while (salario < 0);
		
        do{
            System.out.print("Qual o sexo do funcionário? ");
            sexo = sc.next().toUpperCase().charAt(0);
            if (sexo != 'M' & sexo != 'F'){
                System.out.println("Sexo inválido");
            }
        }while (sexo != 'M' & sexo != 'F');


		do{
			System.out.print("Qual é o estado civil do funcionário? ");
			est_civil = sc.next().toUpperCase().charAt(0);
			if (est_civil !='S' && est_civil != 'C' && est_civil != 'V' && est_civil != 'D'){
                System.out.println("Sexo inválido");
            }
        }while (est_civil !='S' && est_civil != 'C' && est_civil != 'V' && est_civil != 'D');
		
		System.out.println("Obrigado!");
		sc.close();
	}	
}

