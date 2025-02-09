import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Olá ! Seja bem vindo ao Banco X");
        System.out.println("Por favor digite o número da sua conta: ");
        numero = entrada.nextInt();
        System.out.println("Agora digite sua agência, contendo o dígito (xxx-x): ");
        entrada.nextLine();
        agencia = entrada.nextLine();
        System.out.println("Agora digite seu nome: ");
        nomeCliente = entrada.nextLine();
        System.out.println("Agora digite seu saldo: ");
        saldo = entrada.nextDouble();
        entrada.close();

        System.out.println("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numero + " e seu saldo " +
                saldo + " já está disponível para saque." );
    }
}
