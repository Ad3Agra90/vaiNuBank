package br.com.vainaweb.backend.vainubank;

import java.util.Scanner;

public class ContaCorrente extends Cliente implements MetodosBancarios {

	public ContaCorrente (){
		super();
	}
	public ContaCorrente(int numeroDeConta,int agencia,String nomeDoTitular, String cpf, double depositoInicial,
			String dataDeNascimento, double saldo) {
		super(numeroDeConta, agencia, nomeDoTitular, cpf, depositoInicial, dataDeNascimento, saldo);
	}
	@Override
	public void saque() {
		System.out.println("Qual o valor deseja sacar?\n R$ ");
		Scanner v = new Scanner (System.in);
		double valor = v.nextDouble();
		if(getSaldo()<valor) {
			System.out.println("Desculpe, o valor que deseja sacar é maior que o valor em conta! ");
		} else {
			setSaldo(getSaldo() - valor);
		System.out.println("Seu saque foi realizado com sucesso!\n Seu novo saldo é de : R$ " + getSaldo());
		}
	}
	@Override
	public void deposito() {
		System.out.println("Qual o valor deseja depositar?\n R$ ");
		Scanner v = new Scanner (System.in);
		double valor = v.nextDouble();
		setSaldo(getSaldo() + valor);
		System.out.println("Transação realizada com sucesso!\n Novo saldo da conta" + getNumeroDaConta() + "é de : R$ " + getSaldo());
	}
	@Override
	public void transferencia() {
		System.out.println("Qual o valor deseja transferir?\n R$ ");
		Scanner v = new Scanner (System.in);
		double valor = v.nextDouble();
		if(getSaldo()<valor) {
			System.out.println("Desculpe, o valor que deseja transferir é maior que o valor em conta! ");
		} else {
			setSaldo(getSaldo() - valor);
		}
	}
	public void credito() {
		if(getSaldo()>=1000.00) {
			System.out.println("Parabéns você acabou de adquirir um crédito no valor de R$4000,00");
		}else {System.out.println("Infelizmente você não tem crédito disponível");
		}	
	}
}
