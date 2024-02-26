package br.com.vainaweb.backend.vainubank;
import java.util.LinkedList;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		LinkedList<ContaCorrente> clientesContaCorrente = new LinkedList<>();
		LinkedList<ContaPoupanca> clientesContaPoupanca = new LinkedList<>();
		int opcao = 0 ;
		boolean continuar = true;
		while(continuar) {	
			System.out.println("---BEM-VINDO AO BANCO VAI NU BANK---\nESCOLHA A OP��O DESEJADA"
					+"\n 1) ACESSAR CONTA"
					+"\n 2) CADASTRAR CONTA"
					+"\n 3) VISUALIZAR TODAS AS CONTAS"
					+"\n 4) FINALIZAR TRANSA��O");
			opcao = s.nextInt();
			s.nextLine();
			System.out.println(opcao);
			switch(opcao) {
				case 1: //ACESSAR BANCO
					System.out.println("Qual o tipo da conta? Corrente(1) Poupan�a(2)");
					int loginTipoConta = s.nextInt();
					System.out.println("Digite o n�mero da sua conta com 5 d�gitos");
					int loginNumeroConta = s.nextInt();
					if(loginTipoConta == 1) { //CONTACORRENTE
						for (Cliente cliente : clientesContaCorrente) {
							if (cliente.getNumeroDaConta()==(loginNumeroConta)) {
								while(continuar) { 
									System.out.println("QUAL A OPERA��O DESEJA FAZER?"
										+"\n 1) SAQUE"
										+"\n 2) DEP�SITO"
										+"\n 3) TRANSFER�NCIA"
										+"\n 4) EDITAR CONTA"
										+"\n 5) EXCLUIR CONTA"
										+"\n 6) FINALIZAR TRANSA��O");
								int operacao = s.nextInt();
								s.nextLine();
								switch(operacao) {
									case 1://SAQUE
										int posicao = -1;
								        for (int i = 0; i < clientesContaCorrente.size(); i++) {
								            if (clientesContaCorrente.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicao = i;
								                clientesContaCorrente.get(i).saque();
								            }
								        }
								        if (posicao == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
								        continuar = false;
										break;
									case 2://DEPOSITO
										int posicaoD = -1;
								        for (int i = 0; i < clientesContaCorrente.size(); i++) {
								            if (clientesContaCorrente.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicaoD = i;
								                clientesContaCorrente.get(i).deposito();
								            }
								        }
								        if (posicaoD == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
								        continuar = false;
										break;
									case 3://TRANSFERENCIA
										int posicaoT1 = -1;
								        for (int i = 0; i < clientesContaCorrente.size(); i++) {
								            if (clientesContaCorrente.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicaoT1 = i;
								                clientesContaCorrente.get(i).transferencia();
								            }
								        }
								        if (posicaoT1 == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
								        int posicaoT2 = -1;
								        System.out.println("Qual o n�mero da conta que deseja transferir?");
								        int loginNumeroContaTransferencia = s.nextInt();
								        for (int i = 0; i < clientesContaCorrente.size(); i++) {
								            if (clientesContaCorrente.get(i).getNumeroDaConta()==(loginNumeroContaTransferencia)) {
								                posicaoT2 = i;
								                clientesContaCorrente.get(i).deposito();
								            }
								        }
								        if (posicaoT2 == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
										break;
									case 4:
										System.out.println("INFELIZMENTE EST� OP��O AINDA N�O FOI IMPLEMENTADA");
										break;
									case 5://EXCLUIR
										int posicaoE = -1;
								        for (int i = 0; i < clientesContaCorrente.size(); i++) {
								            if (clientesContaCorrente.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicaoE = i;
								                clientesContaCorrente.remove(i);
								                System.out.println("Conta Corrente removida com sucesso!");
								            }
								        }
								        if (posicaoE == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
								        continuar = false;
										break;
									case 6:
										System.out.println("Obrigado e at� a pr�xima!");
										continuar = false;
										break;
									default:
										System.out.println("Desculpe, op��o incorreta!");
								}
								}
							}
						}
					}else if(loginTipoConta == 2) { //POUPANCA
						for (Cliente cliente : clientesContaPoupanca) {
							if (cliente.getNumeroDaConta()==(loginNumeroConta)) {
								while(continuar) { 
									System.out.println("QUAL A OPERA��O DESEJA FAZER?"
										+"\n 1) SAQUE"
										+"\n 2) DEP�SITO"
										+"\n 3) TRANSFER�NCIA"
										+"\n 4) EDITAR CONTA"
										+"\n 5) EXCLUIR CONTA"
										+"\n 6) FINALIZAR TRANSA��O");
								int operacao = s.nextInt();
								s.nextLine();
								switch(operacao) {
									case 1://SAQUE
										int posicao = -1;
								        for (int i = 0; i < clientesContaPoupanca.size(); i++) {
								            if (clientesContaPoupanca.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicao = i;
								                clientesContaPoupanca.get(i).saque();
								            }
								        }
								        if (posicao == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
								        continuar = false;
										break;
									case 2://DEPOSITO
										int posicaoD = -1;
								        for (int i = 0; i < clientesContaPoupanca.size(); i++) {
								            if (clientesContaPoupanca.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicaoD = i;
								                clientesContaPoupanca.get(i).deposito();
								            }
								        }
								        if (posicaoD == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
								        continuar = false;
										break;
									case 3://TRANSFERENCIA
										int posicaoT1 = -1;
								        for (int i = 0; i < clientesContaPoupanca.size(); i++) {
								            if (clientesContaPoupanca.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicaoT1 = i;
								                clientesContaPoupanca.get(i).transferencia();
								            }
								        }
								        if (posicaoT1 == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
								        int posicaoT2 = -1;
								        System.out.println("Qual o n�mero da conta que deseja transferir?");
								        int loginNumeroContaTransferencia = s.nextInt();
								        for (int i = 0; i < clientesContaPoupanca.size(); i++) {
								            if (clientesContaPoupanca.get(i).getNumeroDaConta()==(loginNumeroContaTransferencia)) {
								                posicaoT2 = i;
								                clientesContaPoupanca.get(i).deposito();
								            }
								        }
								        if (posicaoT2 == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
										break;
									case 4:
										System.out.println("INFELIZMENTE EST� OP��O AINDA N�O FOI IMPLEMENTADA");
										break;
									case 5://EXCLUIR
										int posicaoE = -1;
								        for (int i = 0; i < clientesContaPoupanca.size(); i++) {
								            if (clientesContaPoupanca.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicaoE = i;
								                clientesContaPoupanca.remove(i);
								                System.out.println("Conta Poupan�a removida com sucesso!");
								            }
								        }
								        if (posicaoE == -1) {
								        	System.out.println("Conta n�o encontrada!");
								        }
								        continuar = false;
										break;
									case 6:
										System.out.println("Obrigado e at� a pr�xima!");
										continuar = false;
										break;
									default:
										System.out.println("Desculpe, op��o incorreta!");
								}
								}
							}
					}
				}
					continuar = true;
					break;
					
			case 2: //CADASTRAR CONTA
				System.out.println("Qual a conta que deseja cadastrar? (1)Conta Corrente (2)Conta Poupan�a\n");
				int tipoConta = s.nextInt();
				System.out.println("Qual ser� o n�mero da conta com 5 d�gitos:\n");
				int conta = s.nextInt();
				System.out.println("Qual ser� a ag�ncia com 3 d�gitos:\n");
				int agencia =s.nextInt();
				System.out.println("Qual o nome do cliente:\n");
				String cliente = s.next();
				System.out.println("Qual o cpf do cliente:\n");
				String cpf = s.next();
				System.out.println("Qual o dep�sito inicial do cliente:\n");
				double deposito = s.nextDouble();
				System.out.println("Qual a data de nascimento do cliente:\n");
				String dataNascimento = s.next();
				s.nextLine();
				if(tipoConta==1) {
					ContaCorrente clienteContaCorrente = new ContaCorrente(conta,agencia,cliente,cpf,deposito,dataNascimento,deposito);
					System.out.println("\nTIPO DE CONTA: Corrente" + clienteContaCorrente.toString());
					clientesContaCorrente.add(clienteContaCorrente);
					
				}else {
					ContaPoupanca clienteContaPoupanca = new ContaPoupanca(conta,agencia,cliente,cpf,deposito,dataNascimento,deposito);
					System.out.println("\nTIPO DE CONTA: Poupan�a" + clienteContaPoupanca.toString());
					clientesContaPoupanca.add(clienteContaPoupanca);				
				}
				System.out.println("Cliente cadastrado com sucesso! Retornaremos ao menu inicial!");
				break;
			case 3://VISUALIZAR TODAS AS CONTAS
				System.out.println("\nTODAS AS CONTAS POUPAN�A:");
				clientesContaPoupanca.forEach(ContaPoupanca -> {
					System.out.println("\nTipo de conta: Poupan�a" + ContaPoupanca);
				});				
				System.out.println("\nTODAS AS CONTAS CORRENTE:");
				clientesContaCorrente.forEach(ContaCorrente -> {
					System.out.println("\nTipo de conta: Corrente" + ContaCorrente);
				});
	
				break;
			case 4: //FINALIZAR TRANSA��O
				System.out.println("Obrigado e at� a pr�xima!");
				continuar = false;
				break;
			default:
				System.out.println("Desculpe, op��o incorreta!");
			 }
		}
		
	   }
     }