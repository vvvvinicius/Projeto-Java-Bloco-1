package Projeto_Sistema_Java;

import java.util.Scanner;

public class Tabela_materiais {

	static void AbrirTabela()

	{
		System.out.println(" Exemplos de materiais que podem ser descartados !! | Materiais que n�o aceitamos !!");
		System.out.println(" VIDRO: Potes, Garrafas, Copos, etc.                | Pilhas.                       ");
		System.out.println(" PL�STICO: Embalagens, Garrafas PET, etc.           | Baterias.                     ");
		System.out.println(" PAPEL: Papel�o, Jornais, Revistas, etc.            | Lixo Org�nico.                ");
		System.out.println(" METAL: Panelas, Pregos, Arames, etc.               |                               ");
		

		Scanner leia = new Scanner(System.in);

		System.out.println("\n1. Voltar ao menu");
		System.out.println("\n2. Sair");

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
