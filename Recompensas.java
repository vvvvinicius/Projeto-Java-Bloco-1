package Projeto_Sistema_Java;

import java.util.Scanner;

public class Recompensas {

	static void AbrirRecompensas() {

	
		System.out.println(                  "MENU DE PR�MIOS!!"                    );
	    System.out.println("-------------------------------------------------------");
	    System.out.println(" De 10 at� 15 kilos ganha um bloco de notas bag");
	    System.out.println(" De 10 at� 15 kilos ganha uma necessaire ecol�gica ");
	    System.out.println(" De 15 at� 20 kilos ganha uma ecobag");
	    System.out.println(" De 20 at� 30 kilos ganha um kit de copos ecol�gicos de 500ml produzido em fibra de bambu");
	    System.out.println("-------------------------------------------------------\n");
	    System.out.printf("Escolha uma op��o: ");
				
			
				
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
