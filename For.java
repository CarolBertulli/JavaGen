package laco_de_repeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
{
			Scanner ler = new Scanner(System.in);
			
			int num,somaPar=0,somaImpar=0,x;
			
			
			for (x=1;x<=10;x++)
			{
				System.out.println("\nInsira um número: ");
				num = ler.nextInt();
				if (num % 2 == 0)
				{
					somaPar++; 
				}
				else
				
					{
						somaImpar++;
					}
			
				}
				System.out.printf("\nTemos: "+somaPar+" números pares...");
				System.out.printf ("\nTemos: "+somaImpar+" números ímpares...");
	}


}
}