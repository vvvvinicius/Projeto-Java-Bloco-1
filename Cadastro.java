package Projeto_Sistema_Java;

import java.util.Scanner;

public class  Cadastro {

	static void Cadastrando() {

		double vidro = 0, plastico = 0, papel = 0, metal = 0;
		int op = 1;
		boolean entrada = true;

		Scanner leia = new Scanner(System.in);

		while (op != 0) {

			System.out.println("\n--- Menu de materiais ---");
			System.out.println("\nEntre com a op��o do material que deseja descartar: ");
			System.out.println("\n(1) - Vidro");
			System.out.println("\n(2) - Pl�stico");
			System.out.println("\n(3) - Papel");
			System.out.println("\n(4) - Metal");
			System.out.println("\n(0) - Finalizar descarte\n\n");
			op = leia.nextInt();

			switch (op) {
			case 0:

				leia.nextLine();
				entrada = false;
				System.out.println("\nVoc� escolheu sair, programa finalizado.");
				break;

			case 1:

				System.out.printf("\n Digite o quantidade de vidro ");

				vidro = leia.nextDouble();
				
				//vidro = vidro + vidro;

				break;

			case 2:

				System.out.printf("\n Digite o quantidade de Pl�stico ");

				plastico = leia.nextDouble();

				break;

			case 3:

				System.out.printf("\n Digite o quantidade de Papel ");

				papel = leia.nextDouble();

				break;

			case 4:

				System.out.printf("\n Digite o quantidade de Metal ");

				metal = leia.nextDouble();

				break;

			}

		}
		System.out.println("\nLista dos materiais descartados:" + "\nVidro: " + vidro + "\nPl�stico: " + plastico + "\nPapel: "
				+ papel + "\nMetal: " + metal);

		double total = (papel + vidro + plastico + metal);
		System.out.println("\nO peso total de material recicl�vel arrecadado foi de: " + total+"kg.");
		if (total < 5) {
			System.out.println("\nVoc� descartou "+total+"kg de material recic�vel e essa quantia n�o possui recompensa. Agradecemos o descarte! :)");
		}
		if (total >= 5 && total < 10) {
			System.out.println("\nVoc� descartou "+total+"kg de material recic�vel e ganhou um bloco de notas ecol�gico! Retire sua recompensa em um posto autorizado apresentando um documento de identidade com foto.");
		}
		if (total >= 10 && total < 15) {
			System.out.println("\nVoc� descartou "+total+"kg de material recic�vel e ganhou uma necessaire ecol�gica! Retire sua recompensa em um posto autorizado apresentando um documento de identidade com foto.");
		}
		if (total >= 15 && total < 20) {
			System.out.println("\nVoc� descartou "+total+"kg de material recic�vel e ganhou uma ecobag! Retire sua recompensa em um posto autorizado apresentando um documento de identidade com foto.");
		}
		if (total >= 20) {
			System.out.println("\nVoc� descartou "+total+"kg de material recic�vel e ganhou um kit de copos ecol�gicos de 500ml produzido em fibra de bambu! Retire sua recompensa em um posto autorizado apresentando um documento de identidade com foto.");
		}


		int i;

		System.out.println("\n--- Selecione uma op��o ---");
		System.out.println("\n(1) - Voltar para o menu");
		System.out.println("\n(2) - Sair");

		i = leia.nextInt();

		if (i == 1)

		{
			MenuInicial.menu();

		}

		else if (i == 2) {

			System.out.println("Obrigado por usar nosso programa!!!");
		}
	
	}

}