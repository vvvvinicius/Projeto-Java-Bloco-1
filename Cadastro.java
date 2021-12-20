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
			System.out.println("\nEntre com a opção do material que deseja descartar: ");
			System.out.println("\n(1) - Vidro");
			System.out.println("\n(2) - Plástico");
			System.out.println("\n(3) - Papel");
			System.out.println("\n(4) - Metal");
			System.out.println("\n(0) - Finalizar descarte\n\n");
			op = leia.nextInt();

			switch (op) {
			case 0:

				leia.nextLine();
				entrada = false;
				System.out.println("\nVocê escolheu sair, programa finalizado.");
				break;

			case 1:

				System.out.printf("\n Digite o quantidade de vidro ");

				vidro = leia.nextDouble();

				break;

			case 2:

				System.out.printf("\n Digite o quantidade de Plástico ");

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
		System.out.println("\nLista dos materiais descartados:" + "\nVidro: " + vidro + "kg" + "\nPlástico: " + plastico + "kg" + "\nPapel: "
				+ papel + "kg" + "\nMetal: " + metal + "kg");

		double total = (papel + vidro + plastico + metal);
		System.out.printf("\nO peso total de material reciclável arrecadado foi de: %2.1fkg.",total);
		if (total < 5) {
			System.out.println("\nVocê descartou "+total+"kg de material recicável e essa quantia não possui recompensa. Agradecemos o descarte! :)");
		}
		if (total >= 5 && total <= 10) {
			System.out.println("\nVocê descartou "+total+"kg de material recicável e ganhou um BLOCO DE NOTAS DE PAPEL RECICLADO!\nRetire sua recompensa em um posto autorizado apresentando um documento de identidade com foto.");
		}
		if (total > 10 && total <= 15) {
			System.out.println("\nVocê descartou "+total+"kg de material recicável e ganhou uma NECESSAIRE ECOLÓGICA!\nRetire sua recompensa em um posto autorizado apresentando um documento de identidade com foto.");
		}
		if (total > 15 && total <= 20) {
			System.out.println("\nVocê descartou "+total+"kg de material recicável e ganhou uma ECOBAG ECOLÓGICA!\nRetire sua recompensa em um posto autorizado apresentando um documento de identidade com foto.");
		}
		if (total >= 20) {
			System.out.println("\nVocê descartou "+total+"kg de material recicável e ganhou um KIT DE COPOS ECOLÓGICOS FEITOS DE BAMBU!\nRetire sua recompensa em um posto autorizado apresentando um documento de identidade com foto.");
		}


		int i;

		System.out.println("\n--- Selecione uma opção ---");
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