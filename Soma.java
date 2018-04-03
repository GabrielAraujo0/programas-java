import java.util.Scanner;

public class Soma
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);

		int n1;
		int n2;
		int resultado;

		System.out.println("Entre com um numero");
		n1 = input.nextInt();

		System.out.println("Entre com outro numero");
		n2 = input.nextInt();

		resultado = n1+n2;

		System.out.printf("Resultado da soma : %d\n",resultado);

	}
}