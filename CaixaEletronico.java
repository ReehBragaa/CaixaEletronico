package Ativ2Semestre;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Caixa Eletrônico Braços Curtos\n da Unipaulistana");
		System.out.println("");
		System.out.println("");
		System.out.println("1 - Abastecimento");
		System.out.println("");
		System.out.println("2 - Operações Financeiras");
		System.out.println("");
		System.out.println("");
		System.out.println("Digite a opção desejada: ");
		
		int opcao=sc.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu Operação Abastecimento");
			
			System.out.println("\n Valores que podem ser abastecidos");
			System.out.println("\n1 - 200");
			System.out.println("2 - 100");
			System.out.println("3 - 50");
			System.out.println("4 - 20");
			System.out.println("5 - 10");
			System.out.println("6 - 5");
			System.out.println("7 - 2");
			System.out.println("\nDigite a opção que deseja abastecer: ");
			
			int duzentos=sc.nextInt();
			switch (duzentos) {
			case 1:
				System.out.println("\nA escolha foi 200, quantas notas de 200 vai ser abastecida? ");
				int abasteciDuzentos=sc.nextInt();
				int totalDuzentos = abasteciDuzentos*200;
				System.out.println("Total abastecido foi: R$"+totalDuzentos);
				
				break;
			case 2:	
				System.out.println("\nA escolha foi 100, quantas notas de 100 vai ser abastecida? ");
				int abasteciCem=sc.nextInt();
				int totalCEm = abasteciCem*100;
				System.out.println("Total abastecido foi: R$"+totalCEm);
				break;
			case 3:
				System.out.println("\nA escolha foi 50, quantas notas de 50 vai ser abastecida? ");
				int abasteciCinquenta=sc.nextInt();
				int totalCinquenta = abasteciCinquenta*50;
				System.out.println("Total abastecido foi: R$"+totalCinquenta);
				break;
			case 4:
				System.out.println("\nA escolha foi 20, quantas notas de 20 vai ser abastecida? ");
				int abasteciVinte=sc.nextInt();
				int totalVinte = abasteciVinte*20;
				System.out.println("Total abastecido foi: R$"+totalVinte);
				break;
			case 5:
				System.out.println("\nA escolha foi 10, quantas notas de 10 vai ser abastecida? ");
				int abasteciDez=sc.nextInt();
				int totalDez = abasteciDez*10;
				System.out.println("Total abastecido foi: R$"+totalDez);
				break;
			case 6:
				System.out.println("\nA escolha foi 5, quantas notas de 5 vai ser abastecida? ");
				int abasteciCinco=sc.nextInt();
				int totalCinco = abasteciCinco*5;
				System.out.println("Total abastecido foi: R$"+totalCinco);
				break;
			case 7:
				System.out.println("\nA escolha foi 2, quantas notas de 2 vai ser abastecida? ");
				int abasteciDois=sc.nextInt();
				int totalDois = abasteciDois*2;
				System.out.println("Total abastecido foi: R$"+totalDois);
				break;
				

			default:
				System.out.println("Somente esses numeros inteiros da lista, AMIGO!!");
				break;
			}	
			
			break;
		case 2:
			System.out.println("Você escolheu Operações Financeiras ");
			System.out.println("Infelizmente meu conhecimento nesta parte é limitado, preciso estudar sobre este assunto para desenvolver ainda!!");
			System.out.println("Aguarde um pouco que logo estarei desenvolvendo está parte");
			break;
		default:
			System.out.println("A opção escolhida é inexistente. Selecione apenas 1 ou 2.");
			break;
		}
	
		sc.close();

	}

}
