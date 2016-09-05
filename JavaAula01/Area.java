import javax.swing.JOptionPane;
import java.util.Scanner;

class Area{
	public static void main(String args[]){
		System.out.print("Entre quantos vertices tem o poligono, babaca: ");
		Scanner entrada = new Scanner(System.in);
		int verticesPoligono = Integer.parseInt(entrada.nextLine());
		while(verticesPoligono < 3){
			System.out.print("Infeliz, poligono tem mais que dois vertices, tente de novo ");
			entrada = new Scanner(System.in);
			verticesPoligono = Integer.parseInt(entrada.nextLine());
		}
		// int verticesPoligono = Integer.ParseInt(args[0]);
		System.out.print("Obrigado, babaca\r\n");
		System.out.print("Entre a altura agora: \r\n");
		entrada = new Scanner(System.in);
		float altura = Integer.parseInt(entrada.nextLine());
		// int altura =Integer.ParseInt(args[1]);
		System.out.print("Por ultimo a base\r\n");
		entrada = new Scanner(System.in);
		float base = Integer.parseInt(entrada.nextLine());
		//int base = Integer.ParseInt(args[2]);
		// float base = entrada.nextLine();
		double area = (altura * base) / 2;
		int triangulos = verticesPoligono - 2;
		area *= triangulos;
		
		System.out.printf("Parabens, babaca, seu poligono tem %.2f un²\r\n", area);
		// System.out.println("Olá " + nome + ", bem vindo, babaca\r\n");
	}
}