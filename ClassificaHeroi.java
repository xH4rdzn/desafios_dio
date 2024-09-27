import java.util.Scanner;

public class ClassificaHeroi {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nome;
    int exp;
    String nivelHeroi;

    System.out.println("Digite o nome do Herói: ");
    nome = entrada.nextLine();
    System.out.println("Digite a experiencia que o herói possui: ");
    exp = entrada.nextInt();

    if (exp < 1000) {
      nivelHeroi = "Ferro";
    } else if (exp >= 1000 && exp <= 2000) {
      nivelHeroi = "Bronze";
    } else if (exp > 2000 && exp <= 5000) {
      nivelHeroi = "Prata";
    } else if (exp > 6000 && exp <= 7000) {
      nivelHeroi = "Ouro";
    } else if (exp > 7000 && exp <= 8000) {
      nivelHeroi = "Platina";
    } else if (exp > 8000 && exp <= 9000) {
      nivelHeroi = "Ascendente";
    } else if (exp > 9000 && exp <= 10000) {
      nivelHeroi = "Imortal";
    } else {
      nivelHeroi = "Radiante";
    }

    System.out.printf("O Herói de nome %s está no nível de %s%n", nome, nivelHeroi);
  }
}
