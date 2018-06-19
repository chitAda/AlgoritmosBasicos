package com.algoritmosbasicos.main;

import java.util.Scanner;
public class AppTrianguloNumeros {
	static public void main(String[] args)
	{
		int iCant=0;//recibe la cant del usuario
		int cont=1;//va del uno por que la serie es desde ahi
		int cont2=0;//para el while y do while
		Scanner entrada = new Scanner(System.in);
		System.out.println("PIRAMIDE DE NUMEROS ");
		System.out.println("Ingresa Numero Limite For: ");
		iCant=entrada.nextInt();
		System.out.println(iCant);
		//------TRIANGULO DE NUMEROS CON FOR
		for (int x=1;x<=iCant;x++)
		{
			for(int y=0;y<x;y++)
			{
				System.out.print(x);
			}
			System.out.println();
		}
		//---------TRIANGULO DE NUMEROS CON WHILE
		System.out.println("Ingresa Numero Limite While: ");
		iCant=entrada.nextInt();
		while(cont<=iCant)
		{
			cont2=0;//en el while necesitamos inicializar nuestras variables.
			//si no no entraria de nuevo al ciclo
			while(cont2<cont)
			{
				System.out.print(cont);
				cont2++;
			}
			System.out.println();
			cont++;
		}
		//---------TRIANGULO DE NUMEROS CON WHILE
		System.out.println("Ingresa Numero Limite do While: ");
		iCant=entrada.nextInt();
		//
		cont=1;
		cont2=0;
		do {
			cont2=0;
			do {
				System.out.print(cont);
				cont2++;
			}while(cont2<cont);
			cont++;
			System.out.println();
		}while(cont<=iCant);
	}
}
