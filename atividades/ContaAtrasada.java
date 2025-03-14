import java.util.Scanner;

public class ContaAtrasada {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        double valorConta, valorMulta, valorJuros, diasAtraso;

        System.out.print("Digite o valor da conta: ");
        valorConta = input.nextDouble();

        System.out.print("Digite o valor da multa: ");
        valorMulta = input.nextDouble();

        System.out.print("Digite o valor do Juros mensal: ");
        valorJuros = input.nextDouble();

        System.out.print("Digite a quantidade de dias em atraso: ");
        diasAtraso = input.nextDouble();

        if (diasAtraso >= 45) {
            System.out.println("A Conta não pode ser calculada, pois está com um atraso de 45 dias ou mais");
        }
        else {
            double multa = (valorMulta / 100) * valorConta;
            double jurosDiario = (valorJuros / 100) / 30;
            double juros = jurosDiario * diasAtraso * valorConta;
            double valorFinalConta = valorConta + multa + juros;

            System.out.printf("Valor final da conta: R$ %.2f", valorFinalConta);
        }
    }
}