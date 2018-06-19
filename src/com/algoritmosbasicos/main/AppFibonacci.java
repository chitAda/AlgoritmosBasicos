package com.algoritmosbasicos.main;

import java.util.Scanner;

public class AppFibonacci {
	public static void main(String[] args)
	{
		int iCant=0;
		int cont=0;//contador para while y do while
		int ipos1=0;
		int ipos2=1;
		int iActual=0;
		Scanner entrada= new Scanner(System.in);
		//-------FIBONACCI FOR
		System.out.println("Dame el numero para Serie Fibonacci con FOR: ");
		iCant=entrada.nextInt();
		for (int x=0;x<iCant;x++)
		{
			iActual=ipos2+ipos1;
			System.out.print(iActual+" ");
			ipos1=ipos2;
			ipos2=iActual;
		}
		//-------FIBONACCI WHILE
		ipos2=0;
		ipos1=1;
		iActual=0;
		System.out.println("Dame un numero para Serie Fibonacci con WHILE: ");
		iCant=entrada.nextInt();
		while(cont<iCant) {
			iActual=ipos2+ipos1;
			System.out.print(iActual+" ");
			ipos1=ipos2;
			ipos2=iActual;
			cont++;
		}
		System.out.println("Dame un numero para la serie de Fibonacci con DO WHILE");
		iCant=entrada.nextInt();
		cont=0;
		ipos2=0;
		ipos1=1;
		iActual=0;
		do {
			iActual=ipos2+ipos1;
			System.out.print(iActual+" ");
			ipos1=ipos2;
			ipos2=iActual;
			cont++;
		}while(cont<iCant);
	}
}
