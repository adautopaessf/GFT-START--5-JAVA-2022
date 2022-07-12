package Quarta_Questao;

import java.util.Scanner;

/* A idade permitida para doar sangue é entre 18 e 67 anos. Faça um aplicativo que
 pergunte a idade de uma pessoa e diga se ela pode doar sangue ou não. Use alguns
 dos operadores lógicos OU (||) e E (&&). */

public class DoacaoDeSangue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe a sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18 && idade <= 67) {
			System.out.println("Você pode doar sangue!");
		} else {
			System.out.println("Infelizmente você NÃO pode doar sangue!");
		}
		
		scan.close();

	}

}
