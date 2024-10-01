public class Hero {
  private String ataque;
  private String nome;
  private int idade;
  private String tipo;

  public Hero(String nome, int idade, String tipo) {
    this.nome = nome;
    this.idade = idade;
    this.tipo = tipo;
  }

  public void atacar() {
    if (this.tipo == "mago") {
      this.ataque = "magia";
      System.out.printf("O %s atacou usando %s%n", this.tipo, this.ataque);
    } else if (this.tipo == "guerreiro") {
      this.ataque = "espada";
      System.out.printf("O %s atacou usando %s%n", this.tipo, this.ataque);
    } else if (this.tipo == "monge") {
      this.ataque = "artes Marciais";
      System.out.printf("O %s atacou usando %s%n", this.tipo, this.ataque);
    } else if (this.tipo == "ninja") {
      this.ataque = "shuriken";
      System.out.printf("O %s atacou usando %s%n", this.tipo, this.ataque);
    } else {
      System.out.printf("A classe - %s não está disponível, tente uma das classes abaixo:\n-mago\n-guerreiro\n-monge\n-ninja", this.tipo);
    }
  }

  public static void main(String[] args) {
    
    Hero mago = new Hero("Fabiano", 26, "mago");
    Hero guerreiro = new Hero("Fernando", 30, "guerreiro");
    Hero monge = new Hero("José", 18, "monge");
    Hero ninja = new Hero("Fabiano", 26, "ninja");
    Hero err = new Hero("Tales", 21, "elfo");


    mago.atacar();
    guerreiro.atacar();
    monge.atacar();
    ninja.atacar();
    err.atacar();
  }
}
