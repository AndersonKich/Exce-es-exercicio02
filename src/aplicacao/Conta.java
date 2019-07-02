package aplicacao;

import model.Excecao.Erro;

public class Conta {

	private Integer numeroConta;
	private String nomeTitular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() {
		
	}
	public Conta(Integer numeroConta, String nomeTitular, Double saldo,Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void depositar(Double valor) {
		saldo += valor;
		
	}
	public void saqueConta(Double saque) {
		if(saque > saldo) {
			throw new Erro ("Erro de saque! seu saldo é insufuciente para o saque");
		}else if(saque > limiteSaque) {
			throw new Erro ("Erro de saque! limite para saque excedido...");
		}
		
		
		if(saque <= saldo && saque <= limiteSaque) {
			saldo -= saque; 
		}
	}
	

}
