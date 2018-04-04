/*1 - Escreva um programa efetuar o cálculo do salário bruto e do salário

líquido de um empregado. Os dados fornecidos são:

 

- O valor do salário hora

- O número de horas trabalhadas no mês

- O percentual de desconto do INSS*/

import java.util.Scanner;


public class Salario
{
	public static void main(String args[])
	{
		
		int salario;
		int hora;
		int inss;
		int liquido;
		int bruto;

		Scanner input = new Scanner (System.in);

		System.out.println("Digite o salario Hora");
		salario = input.nextInt();

		System.out.println("Digite as horas trabalhadas em um mês");
		hora = input.nextInt();

		System.out.println("Digite o desconto do INSS");
		inss = input.nextInt();

		bruto = (salario*hora);
		liquido = (bruto-inss);

		System.out.printf("Salario Liquido %d \n",liquido);
		System.out.printf("Salario Bruto %d \n",bruto);
	}
}