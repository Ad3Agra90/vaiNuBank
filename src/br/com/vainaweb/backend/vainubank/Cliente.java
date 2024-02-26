package br.com.vainaweb.backend.vainubank;

public class Cliente {

	private int numeroDaConta;
	private int agencia;
	private String nomeDoTitular;
	private String cpf;
	private double depositoInicial;
	private String dataDeNascimento;
	private double saldo = depositoInicial;
	public Cliente() {
	}
	public Cliente(int numeroDaConta, int agencia, String nomeDoTitular, String cpf, double depositoInicial,
			String dataDeNascimento, double saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
		this.nomeDoTitular = nomeDoTitular;
		this.cpf = cpf;
		this.depositoInicial = depositoInicial;
		this.dataDeNascimento = dataDeNascimento;
		this.saldo = saldo;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public String getNomeDoTitular() {
		return nomeDoTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public double getDepositoInicial() {
		return depositoInicial;
	}
	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "\nNome: " + nomeDoTitular + "\n" + "Cpf: " + cpf + "\n" + "Data de nascimento: " + dataDeNascimento 
				+ "\n" + "Agência: " + agencia + "\n" + "Número da conta: " + numeroDaConta + "\n"
				+ "Saldo: " + saldo + "\n";
	}
	

	
	
	

}
