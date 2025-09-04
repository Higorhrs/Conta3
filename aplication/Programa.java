package aplication;

import java.util.Locale;
import java.util.Scanner;



import repository.ContaRepository;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Conta conta = new Conta(1234, "Teste");
		ContaRepository c = new ContaRepository();
		
		
		System.out.println(c);
		
		c.criarConta(123, "Tete");
		
		c.depositar(200.00);
		
		
		
		
		
		sc.close();
		
	}

}
