import java.util.Random;

public class JogandoDados {
    public static Random geradorAleatorio = new Random();
    public static void main(String[] args) {
        int pontuacaoJogador1 = 0;
        int pontuacaoJogador2 = 0;
        for (int i = 1; i <= 10; i += 1) {
            int dadoJogador1 = (int) (geradorAleatorio.nextInt(6) + 1) ;
            int dadoJogador2 = (int) (geradorAleatorio.nextInt(6) + 1);

            System.out.println("Jogador 1: " + dadoJogador1 + " - " + "Jogador 2: " + dadoJogador2);

            if (dadoJogador1 > dadoJogador2) {
                System.out.println("Jogador 1 Ganhou\n");
                pontuacaoJogador1++;
            } else if (dadoJogador2 > dadoJogador1) {
                System.out.println("Jogador 2 Ganhou\n");
                pontuacaoJogador2++;
            } else {
                System.out.println("Empate\n");
            }
        }
        if (pontuacaoJogador1 > pontuacaoJogador2) {
            System.out.println("Jogador 1 Ganhou por " + pontuacaoJogador1 + " x " + pontuacaoJogador2);
        } else if (pontuacaoJogador2 > pontuacaoJogador1) {
            System.out.println("Jogador 2 Ganhou por " + pontuacaoJogador2 + " x " + pontuacaoJogador1);
        } else {
            System.out.println("Empate");
        }
    }
}
