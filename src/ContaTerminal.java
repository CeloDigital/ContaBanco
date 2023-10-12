import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Atributos/Tipos
        String nome, agencia;
        int numeroDaConta;
        double saldo;
        
        //Programa e Usuário
        System.out.println("Por favor, digite o número da Conta!");
        numeroDaConta = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();

        System.out.println("Por favor, digite o Saldo!");
        saldo = sc.nextDouble();

        System.out.println("Por favor, digite o Nome!");
        nome = sc.next();

        sc.close();
        
        //Resultado das informações
        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agência é: " + agencia + ", Conta: " + numeroDaConta + " e seu Saldo: " + saldo + " já está disponível para saque.");
    }
}
