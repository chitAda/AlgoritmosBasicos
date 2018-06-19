package com.algoritmosbasicos.main;
import java.util.Scanner;
public class AppPrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum=0;
		boolean isPrimo=true;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Dame un numero");
		iNum=entrada.nextInt();
		for(int cont=2;cont<iNum;cont++) {
			if (iNum%cont==0) {
				isPrimo=false;
			}
		}
		System.out.println("El numero introducido es primo? "+isPrimo);
	}

}
