package repository;

import model.Conta;

public class ContaRepository {
	
	Conta conta; 
	
	public void criarConta(int numeroConta, String nomeTitular) {
		conta = new Conta(numeroConta, nomeTitular);
		System.out.println("Conta Criada com sucesso");
	}
	public void depositar(double valor) {
		if(conta != null) {
		conta.setSaldo(conta.getSaldo() + valor);
		System.out.println("Deposito de R$" + valor + " realizado com sucesso");
		}
	}
	
	public void depositar() {
	}
	public void sacar() {
		
	}
	public void alterar() {
	
	}
	public void excluirConta() {
		
	}
	
	@Override
	public String toString() {
		if(conta != null) {
		return conta.toString() ;
		}else
		return "Nnehuma conta criada";
	}
	

}
