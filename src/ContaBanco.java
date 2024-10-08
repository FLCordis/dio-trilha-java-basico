import java.util.Scanner;
import java.util.Locale;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira o número da conta!");
        int numero = sc.nextInt();

        System.out.println("Insira o número da Agência!");
        String agencia = sc.next();

        System.out.println("Insira o nome do Cliente!");
        String nomeCliente = sc.next();

        double saldo = 545.50;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo $" + saldo + " já está disponível para saque.");

        sc.close();
    }
}
