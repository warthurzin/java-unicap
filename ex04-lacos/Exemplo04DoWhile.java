import java.util.Scanner;

public class Exemplo04DoWhile {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1, num2, qntInterv;

        System.out.print("Digite um número inteiro: ");
        num1 = input.nextInt();

        System.out.print("Digite um número inteiro maior que " + num1 + ": ");
        num2 = input.nextInt();

        do{
            System.out.print("Digite um número inteiro maior que " + num1 + ": ");
            num2 = input.nextInt();
            if (num2 <= num1) {
                System.out.println("Valor inválido!");
            }
        } while (num2 <= num1);

        qntInterv = num2 - num1 + 1;
        System.out.println("Existem " + qntInterv + " números no intervalo entre " + num1 + " a " + num2);
    }
}
