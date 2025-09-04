package model;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public Conta() {
	}
	
	
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}



	public Conta(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String toString() {
		return "Conta: " + numeroConta 
				+ " - Titular: " 
				+ nomeTitular 
				+  String.format("Saldo R$%.2f", saldo);
	}

}
