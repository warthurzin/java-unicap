import java.util.Scanner;

public class Imc {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double peso,altura;
        System.out.print("Qual o seu peso corporal? ");
        peso = input.nextDouble();
        System.out.print("Qual a sua altura? ");
        altura = input.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu imc é " + String.format("%.2f",imc));
        if (imc < 18.5) {
          System.out.println("Você está abaixo do peso normal");
        } else if (imc < 25) {
          System.out.println("Seu peso está normal");
        } else if (imc < 30) {
          System.out.println("Você está com excesso de peso");
        } else if (imc < 35) {
          System.out.println("Você está com Obesidade classe 1");
        } else if (imc < 40) {
          System.out.println("Você está com Obesidade classe 2");
        } else{
          System.out.println("Você está com Obesidade classe 3");
        }
    }
}