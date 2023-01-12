package laco_de_repeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		int numero , soma = 0;
	 
		System.out.println("Digite um número: ");	 
	 
		 do 
         {
         numero = ler.nextInt();
             if (numero>0)
             {
                 soma = numero + soma;
             }
         }
		 while (numero!= 0);
		 System.out.println("\nA soma dos números digitados foi: "+soma);

	}

}
