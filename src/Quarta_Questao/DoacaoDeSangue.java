package Quarta_Questao;

import java.util.Scanner;

/* A idade permitida para doar sangue � entre 18 e 67 anos. Fa�a um aplicativo que
 pergunte a idade de uma pessoa e diga se ela pode doar sangue ou n�o. Use alguns
 dos operadores l�gicos OU (||) e E (&&). */

public class DoacaoDeSangue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Informe a sua idade: ");
		int idade = scan.nextInt();
		
		if (idade >= 18 && idade <= 67) {
			System.out.println("Voc� pode doar sangue!");
		} else {
			System.out.println("Infelizmente voc� N�O pode doar sangue!");
		}
		
		scan.close();

	}

}
