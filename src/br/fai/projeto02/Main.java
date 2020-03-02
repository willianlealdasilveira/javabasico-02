package br.fai.projeto02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.mm();

	}
     private void mm() {

	
	Scanner ler = new Scanner (System.in);
	System.out.println("Digite um valor double ");
	double valor = ler.nextDouble();
	
	int valorComcast =(int) valor ;
	System.out.println("o valor com casas decimais"+ valor+"valor nteiro"+valorComcast);
	
	int novovalor =10;
	double valorcovertido = novovalor;
	
	System.out.println("novo "+novovalor+"valor convertido"+valorcovertido);
  }
}
