import javax.swing.JOptionPane;
import java.util.Scanner;

class Saudacao{
	public static void main(String args[]){
		// System.out.print("Entre seu nome, babaca: ");
		// Scanner entrada = new Scanner(System.in);
		// String nome = entrada.nextLine();
		String nome = JOptionPane.showInputDialog("Entre seu nome e seja feliz: ");
		System.out.print("Obrigado, babaca\r\n");
		
		System.out.println("Olá " + nome + ", bem vindo, babaca\r\n");
	}
}