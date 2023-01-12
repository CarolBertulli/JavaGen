package laco_de_repeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, x=1, somaPar = 0, somaImpar = 0;
		
		Scanner Ler = new Scanner(System.in);
		
		while(x<=10) 
	{
			System.out.println("Insira um número: ");
			num = Ler.nextInt();
			
			if(num %2 == 0) {
			
			somaPar++;
			}
			
			else {
			somaImpar++;
			
			}
			
			x++;
			
	}
		System.out.println("\nQuantidade de Números pares: "+somaPar);
		
		System.out.println("\nQuantidade de Números ímpares: "+somaImpar);
			 
			
	}

}
