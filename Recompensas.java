package Projeto_Sistema_Java;

import java.util.Scanner;

public class Recompensas {

	static void AbrirRecompensas() {

	
		System.out.println(                  "MENU DE PRÊMIOS!!"                    );
	    System.out.println("-------------------------------------------------------");
	    System.out.println(" De 10 até 15 kilos ganha um bloco de notas bag");
	    System.out.println(" De 10 até 15 kilos ganha uma necessaire ecológica ");
	    System.out.println(" De 15 até 20 kilos ganha uma ecobag");
	    System.out.println(" De 20 até 30 kilos ganha um kit de copos ecológicos de 500ml produzido em fibra de bambu");
	    System.out.println("-------------------------------------------------------\n");
	    System.out.printf("Escolha uma opção: ");
				
			
				
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
