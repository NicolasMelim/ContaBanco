package BancoTerminal;
import java.util.Scanner;
public class Desafio_Santander_Bootcamp  {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Bem vindo ao Banco, preciso que você me responda algumas informações!");
	
	System.out.println("Digite o seu nome");
	String nome = scanner.next();
	
	System.out.println("Digite o seu sobrenome");
	String sobrenome = scanner.next();
	
	System.out.println("Digite o numero da conta");
	int numero = scanner.nextInt();
	
	System.out.println("Digite a agencia");
	String agencia = scanner.next();
	
	System.out.println("Digite o seu saldo");
	double saldo = scanner.nextDouble();
	
	
	System.out.println("Olá" + nome + " " + sobrenome + " obrigado por criar uma conta em nosso banco, a sua agência é " + agencia + ", conta" +  numero + " e o seu saldo de "  + saldo + " já está disponível para saque!");
	
}
}
