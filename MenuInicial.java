package Projeto_Sistema_Java;

import java.util.Scanner;

public class MenuInicial {

	public static void menu() {

		System.out.println(
				"|_   __ \\   |_   __  | .' ___  ||_   _|.' ___  ||_   _|        / \\               .' ____ \\ |_   __ \\  \r\n"
						+ "  | |__) |    | |_ \\_|/ .'   \\_|  | | / .'   \\_|  | |         / _ \\      ______  | (___ \\_|  | |__) | \r\n"
						+ "  |  __ /     |  _| _ | |         | | | |         | |   _    / ___ \\    |______|  _.____`.   |  ___/  \r\n"
						+ " _| |  \\ \\_  _| |__/ |\\ `.___.'\\ _| |_\\ `.___.'\\ _| |__/ | _/ /   \\ \\_           | \\____) | _| |_     \r\n"
						+ "|____| |___||________| `.____ .'|_____|`.____ .'|________||____| |____|           \\______.'|_____| ");

		Scanner leia = new Scanner(System.in);

		System.out.println("******************************** MENU **********************************");
		System.out.println("\n                   Bem vindes ao Recicla SP\n"
				+ "========================================================================");

		int opcao;

		System.out.println("                       SELECIONE UMA OPÇÃO \n"
				+ "========================================================================\n1. " + "Cadastro\n2. "
				+ "Tabela de materiais aceitos\n3. " + "Tabela de informações de recompensas\n4. "
				+ "Informações do sistema");

		opcao = leia.nextInt();

		if (opcao == 1)

		{
			Cadastro.Cadastrando();
		}

		else if (opcao == 2) {
			Tabela_materiais.AbrirTabela();
		}

		else if (opcao == 3)

		{
			Recompensas.AbrirRecompensas();
		}

		else if (opcao == 4) {
			informacao.AbrirInformacao();
		}

	}

}
