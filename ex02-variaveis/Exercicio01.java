import java.util.Scanner;

public class Exercicio01 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double precoAntigo, precoAtual;
        
        System.out.print("Digite o antigo valor do produto: ");
        precoAntigo = input.nextDouble();

        System.out.print("Digite o novo valor do produto: ");
        precoAtual = input.nextDouble();

        double aumento = (precoAtual - precoAntigo) / precoAntigo * 100;

        System.out.println("O percentual de aumento foi de " + String.format("%.2f", aumento) + "%");
    }
}
