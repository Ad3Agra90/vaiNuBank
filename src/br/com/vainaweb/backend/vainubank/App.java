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
			System.out.println("---BEM-VINDO AO BANCO VAI NU BANK---\nESCOLHA A OPÇÃO DESEJADA"
					+"\n 1) ACESSAR CONTA"
					+"\n 2) CADASTRAR CONTA"
					+"\n 3) VISUALIZAR TODAS AS CONTAS"
					+"\n 4) FINALIZAR TRANSAÇÃO");
			opcao = s.nextInt();
			s.nextLine();
			System.out.println(opcao);
			switch(opcao) {
				case 1: //ACESSAR BANCO
					System.out.println("Qual o tipo da conta? Corrente(1) Poupança(2)");
					int loginTipoConta = s.nextInt();
					System.out.println("Digite o número da sua conta com 5 dígitos");
					int loginNumeroConta = s.nextInt();
					if(loginTipoConta == 1) { //CONTACORRENTE
						for (Cliente cliente : clientesContaCorrente) {
							if (cliente.getNumeroDaConta()==(loginNumeroConta)) {
								while(continuar) { 
									System.out.println("QUAL A OPERAÇÃO DESEJA FAZER?"
										+"\n 1) SAQUE"
										+"\n 2) DEPÓSITO"
										+"\n 3) TRANSFERÊNCIA"
										+"\n 4) EDITAR CONTA"
										+"\n 5) EXCLUIR CONTA"
										+"\n 6) FINALIZAR TRANSAÇÃO");
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
								        	System.out.println("Conta não encontrada!");
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
								        	System.out.println("Conta não encontrada!");
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
								        	System.out.println("Conta não encontrada!");
								        }
								        int posicaoT2 = -1;
								        System.out.println("Qual o número da conta que deseja transferir?");
								        int loginNumeroContaTransferencia = s.nextInt();
								        for (int i = 0; i < clientesContaCorrente.size(); i++) {
								            if (clientesContaCorrente.get(i).getNumeroDaConta()==(loginNumeroContaTransferencia)) {
								                posicaoT2 = i;
								                clientesContaCorrente.get(i).deposito();
								            }
								        }
								        if (posicaoT2 == -1) {
								        	System.out.println("Conta não encontrada!");
								        }
										break;
									case 4:
										System.out.println("INFELIZMENTE ESTÁ OPÇÃO AINDA NÃO FOI IMPLEMENTADA");
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
								        	System.out.println("Conta não encontrada!");
								        }
								        continuar = false;
										break;
									case 6:
										System.out.println("Obrigado e até a próxima!");
										continuar = false;
										break;
									default:
										System.out.println("Desculpe, opção incorreta!");
								}
								}
							}
						}
					}else if(loginTipoConta == 2) { //POUPANCA
						for (Cliente cliente : clientesContaPoupanca) {
							if (cliente.getNumeroDaConta()==(loginNumeroConta)) {
								while(continuar) { 
									System.out.println("QUAL A OPERAÇÃO DESEJA FAZER?"
										+"\n 1) SAQUE"
										+"\n 2) DEPÓSITO"
										+"\n 3) TRANSFERÊNCIA"
										+"\n 4) EDITAR CONTA"
										+"\n 5) EXCLUIR CONTA"
										+"\n 6) FINALIZAR TRANSAÇÃO");
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
								        	System.out.println("Conta não encontrada!");
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
								        	System.out.println("Conta não encontrada!");
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
								        	System.out.println("Conta não encontrada!");
								        }
								        int posicaoT2 = -1;
								        System.out.println("Qual o número da conta que deseja transferir?");
								        int loginNumeroContaTransferencia = s.nextInt();
								        for (int i = 0; i < clientesContaPoupanca.size(); i++) {
								            if (clientesContaPoupanca.get(i).getNumeroDaConta()==(loginNumeroContaTransferencia)) {
								                posicaoT2 = i;
								                clientesContaPoupanca.get(i).deposito();
								            }
								        }
								        if (posicaoT2 == -1) {
								        	System.out.println("Conta não encontrada!");
								        }
										break;
									case 4:
										System.out.println("INFELIZMENTE ESTÁ OPÇÃO AINDA NÃO FOI IMPLEMENTADA");
										break;
									case 5://EXCLUIR
										int posicaoE = -1;
								        for (int i = 0; i < clientesContaPoupanca.size(); i++) {
								            if (clientesContaPoupanca.get(i).getNumeroDaConta()==(loginNumeroConta)) {
								                posicaoE = i;
								                clientesContaPoupanca.remove(i);
								                System.out.println("Conta Poupança removida com sucesso!");
								            }
								        }
								        if (posicaoE == -1) {
								        	System.out.println("Conta não encontrada!");
								        }
								        continuar = false;
										break;
									case 6:
										System.out.println("Obrigado e até a próxima!");
										continuar = false;
										break;
									default:
										System.out.println("Desculpe, opção incorreta!");
								}
								}
							}
					}
				}
					continuar = true;
					break;
					
			case 2: //CADASTRAR CONTA
				System.out.println("Qual a conta que deseja cadastrar? (1)Conta Corrente (2)Conta Poupança\n");
				int tipoConta = s.nextInt();
				System.out.println("Qual será o número da conta com 5 dígitos:\n");
				int conta = s.nextInt();
				System.out.println("Qual será a agência com 3 dígitos:\n");
				int agencia =s.nextInt();
				System.out.println("Qual o nome do cliente:\n");
				String cliente = s.next();
				System.out.println("Qual o cpf do cliente:\n");
				String cpf = s.next();
				System.out.println("Qual o depósito inicial do cliente:\n");
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
					System.out.println("\nTIPO DE CONTA: Poupança" + clienteContaPoupanca.toString());
					clientesContaPoupanca.add(clienteContaPoupanca);				
				}
				System.out.println("Cliente cadastrado com sucesso! Retornaremos ao menu inicial!");
				break;
			case 3://VISUALIZAR TODAS AS CONTAS
				System.out.println("\nTODAS AS CONTAS POUPANÇA:");
				clientesContaPoupanca.forEach(ContaPoupanca -> {
					System.out.println("\nTipo de conta: Poupança" + ContaPoupanca);
				});				
				System.out.println("\nTODAS AS CONTAS CORRENTE:");
				clientesContaCorrente.forEach(ContaCorrente -> {
					System.out.println("\nTipo de conta: Corrente" + ContaCorrente);
				});
	
				break;
			case 4: //FINALIZAR TRANSAÇÃO
				System.out.println("Obrigado e até a próxima!");
				continuar = false;
				break;
			default:
				System.out.println("Desculpe, opção incorreta!");
			 }
		}
		
	   }
     }