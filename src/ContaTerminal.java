import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.println("Digite o número da sua agência, utilizando este modelo (XXX-X):");
		String agencia = scanner.next();
		
		System.out.println("Digite o número o número da sua conta: ");
		int conta = scanner.nextInt();
		
		System.out.println("Digite o seu saldo: ");
		float saldo = scanner.nextFloat();
		
		
		System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: [" + agencia + "], conta [" + conta + 
				"] e o seu saldo [" + saldo + "] já está disponível para saque!!");
		
		
		
		
	}

}
