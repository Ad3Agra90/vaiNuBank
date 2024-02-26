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
			System.out.println("Desculpe, o valor que deseja sacar � maior que o valor em conta! ");
		} else {
			setSaldo(getSaldo() - valor);
		System.out.println("Seu saque foi realizado com sucesso!\n Seu novo saldo � de : R$ " + getSaldo());
		}
	}
	@Override
	public void deposito() {
		System.out.println("Qual o valor deseja depositar?\n R$ ");
		Scanner v = new Scanner (System.in);
		double valor = v.nextDouble();
		setSaldo(getSaldo() + valor);
		System.out.println("Transa��o realizada com sucesso!\n Novo saldo da conta" + getNumeroDaConta() + "� de : R$ " + getSaldo());
	}
	@Override
	public void transferencia() {
		System.out.println("Qual o valor deseja transferir?\n R$ ");
		Scanner v = new Scanner (System.in);
		double valor = v.nextDouble();
		if(getSaldo()<valor) {
			System.out.println("Desculpe, o valor que deseja transferir � maior que o valor em conta! ");
		} else {
			setSaldo(getSaldo() - valor);
		}
	}
	public void credito() {
		if(getSaldo()>=1000.00) {
			System.out.println("Parab�ns voc� acabou de adquirir um cr�dito no valor de R$4000,00");
		}else {System.out.println("Infelizmente voc� n�o tem cr�dito dispon�vel");
		}	
	}
}
