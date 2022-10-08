import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		double salHora, hrsTrab, salMes;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Quanto voce ganha por hora ");
		salHora = teclado.nextDouble();
		System.out.println("Quantas horas voce trabalhou no mes ");
		hrsTrab = teclado.nextDouble();
		
		salMes = salHora*hrsTrab;
		System.out.println("Neste mes voce ganhou R$ " + salMes);
		
		teclado.close();
	}

}
