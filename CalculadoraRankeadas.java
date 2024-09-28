import java.util.Scanner;

public class CalculadoraRankeadas {
  public static void main(String[] args) {
    int saldo, vitorias, derrotas;
    String rank;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe a quantidade de vítorias: ");
    vitorias = entrada.nextInt();
    System.out.print("Informe a quantidade de derrotas: ");
    derrotas = entrada.nextInt();
    saldo = calculaSaldo(vitorias, derrotas);
    rank = calculaRank(saldo);
    System.out.printf("O Herói tem saldo de %d vítorias e está no ranking %s", saldo, rank);
    entrada.close();
  }

  public static int calculaSaldo(int vitorias, int derrotas) {
    return vitorias - derrotas;
  }

  public static String calculaRank(int saldo) {
    String rank;
    if(saldo < 10) {
      rank = "Ferro";
    } else if (saldo > 10 && saldo <= 20) {
      rank = "Bronze";
    } else if (saldo > 20 && saldo <= 50) {
      rank = "Prata";
    } else if (saldo > 50 && saldo <= 80) {
      rank = "Ouro";
    } else if (saldo > 80 && saldo <= 90) {
      rank = "Diamante";
    } else if (saldo > 90 && saldo <= 100) {
      rank = "Lendário";
    } else {
      rank = "Imortal";
    }
    return rank;
  }
}
