import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de Conta Bancária:");
        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite a agência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Agora digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o saldo: ");
        double saldoCliente = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponível para saque.");
    }
}
