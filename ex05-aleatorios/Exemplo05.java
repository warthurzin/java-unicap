import java.util.Random;

public class Exemplo05 {
    public static Random geradorAleatorio = new Random();
    public static void main(String[] args) {
        int somatorio = 0;
        for (int i = 1; i <= 10; i += 1) {
            // int aleatorio = (int) Math.floor(Math.random()* 6) + 1;
            int aleatorio = geradorAleatorio.nextInt(6) + 1;
            System.out.println(aleatorio);
            somatorio += aleatorio;
        }
        System.out.println("Somatório = " + somatorio);
    }
}
