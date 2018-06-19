package com.algoritmosbasicos.main;

import java.util.Scanner;
public class AppFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum=0;
		int iRes=1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa numero para Factorial con FOR: ");
		iNum=entrada.nextInt();
		
		for(int x=1;x<=iNum;x++)
		{
			System.out.print(x+"*");
			iRes*=x;
		}
		System.out.println(" = "+iRes);
	}

}
