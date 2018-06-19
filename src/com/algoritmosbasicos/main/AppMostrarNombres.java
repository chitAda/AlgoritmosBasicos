package com.algoritmosbasicos.main;
//libreria del scanner
import java.util.Scanner;
public class AppMostrarNombres 
{
	public static void main(String[] args ) 
	{//el macho recomienda usarlo asi para mas visibilidad
		//declaracion e inicializacion de variables
		String sNom="";
		int variable=0;
		char caracter=' ';
		double valor=0.0;
		boolean isTrue=false;
		float valor2=0.0f;//f para que lo reconozca como float
		Scanner entrada = new Scanner(System.in);//recomendado usar entradade nombre
		//---------CICLO FOR
		System.out.println("dame tu nombre para el For:");
		sNom=entrada.nextLine();//da desde el inicio hasta el salto de linea
		for(int cont=0;cont<10;cont++) 
		{
			System.out.println("hola "+sNom);
		}
		//---------CICLO CON WHILE
		System.out.println("Dame tu Nombre para el while:");
		sNom=entrada.nextLine();
		while(variable<10)
		{
			System.out.println("hola "+sNom);
			variable++;
		}
		//---------CICLO DO WHILE
		System.out.println("dame tu nombre para el do While");
		sNom=entrada.nextLine();
		do
		{
			
			System.out.println("hola "+sNom);
			valor++;
		}while(valor<10);
	}
	
}
