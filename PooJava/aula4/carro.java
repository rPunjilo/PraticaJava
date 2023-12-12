package aula4;

public class carro {
    //Atributos:
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;
    
    //Métodos ou funções:
    void exibirAutonomia(){
        System.out.printf("A autonomia do carro é: %s KM\n", (capCombustivel * consCombustivel));
    }

    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado!!");
        
        return capCombustivel*consCombustivel;
    }
}
