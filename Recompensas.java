package Projeto_Sistema_Java;

import java.util.Scanner;

public class Recompensas {

	static void AbrirRecompensas() {

		System.out.println("==========================================================================================");
		System.out.println("                                  MENU DE RECOMPENSAS!");
	    System.out.println("------------------------------------------------------------------------------------------");
	    System.out.println(" De 5 até 10 quilos ganha um BLOCO DE NOTAS DE PAPEL RECICLADO");
	    System.out.println(" De 11 até 15 quilos ganha uma NECESSAIRE ECOLÓGICA");
	    System.out.println(" De 16 até 20 quilos ganha uma ECOBAG ECOLÓGICA");
	    System.out.println(" Mais de 20 quilos ganha um KIT DE COPOS ECOLÓGICOS FEITOS DE BAMBU");
	    System.out.println("==========================================================================================");
	    System.out.printf("\nEscolha uma opção: ");
				
			
				
		System.out.println("\n1. Voltar ao menu");
		System.out.println("\n2. Sair");

		Scanner leia = new Scanner(System.in);
		int i;
		i = leia.nextInt();

		if (i == 1)

		{
			MenuInicial.menu();

		}

		else if (i == 2) {
			System.out.println("\nObrigado por usar o Sistema!!!");

		}
	}
}
