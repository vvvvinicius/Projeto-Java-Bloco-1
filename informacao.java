package Projeto_Sistema_Java;

import java.util.Scanner;

public class informacao {

	static void AbrirInformacao()

	{

		System.out.println("************************** Informa��es do Sistema **************************");
		System.out.println("\n O objetivo desse sistema � gerenciar melhor um sistema de Reciclagem"
				+ "\n na  Cidade de S�o Paulo e aprimorar os conhecimentos em Java");

		System.out.println("\n************************** Desenvolvedores **************************");
		System.out.println("\nBruno Felix " + "\nDiego Martins" + "\nRaif Sousa" + "\nCibele Fran�a" + "\nVin�cius Barbosa"+"\nMariana Souza");

		System.out.println("\n************************** Vers�o do Sistema **************************");
		System.out.println("\n1  Vers�o Beta n�mero ----> .0.0 - ");

		Scanner ler = new Scanner(System.in);
		int i;

		System.out.println("\n************************** Selecione uma op��o **************************");
		System.out.println("\n(1) - Voltar para o menu");
		System.out.println("\n(2) - Sair");

		i = ler.nextInt();

		if (i == 1)

		{
			MenuInicial.menu();

		}

		else if (i == 2) {

			System.out.println(
					"  ___   __                 _                       __                     ______                      __   \r\n"
							+ " .'   `.[  |               (_)                     |  ]                  .' ___  |                   _|_ `. \r\n"
							+ "/  .-.  \\| |.--.   _ .--.  __   .--./) ,--.    .--.| |  .--.    ______  / .'   \\_|  .---.  _ .--.   (_) | | \r\n"
							+ "| |   | || '/'`\\ \\[ `/'`\\][  | / /'`\\;`'_\\ : / /'`\\' |/ .'`\\ \\ |______| | |   ____ / /__\\\\[ `.-. |   _  | | \r\n"
							+ "\\  `-'  /|  \\__/ | | |     | | \\ \\._//// | |,| \\__/  || \\__. |          \\ `.___]  || \\__., | | | |  (_)_| | \r\n"
							+ " `.___.'[__;.__.' [___]   [___].',__` \\'-;__/ '.__.;__]'.__.'            `._____.'  '.__.'[___||__]   |__,' \r\n"
							+ "                              ( ( __))                                                                      ");

		}
	}
}
