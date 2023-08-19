import java.util.Scanner;

public class ContaTerminal {
    String nomeCliente;
    String agencia;
    int numeroConta;
    float saldo;

    public ContaTerminal(String nomeCliente, String agencia, int numeroConta, float saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia +
                ", conta " + numeroConta + "e seu saldo " + saldo + "já está disponível para saque\"");

        ContaTerminal conta = new ContaTerminal(nomeCliente, agencia, numeroConta, saldo);

        scanner.close();
    }


}

