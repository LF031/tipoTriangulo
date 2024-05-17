import java.util.*;
public class Exercicio2_5 {

	public static void main(String[] args) {
		// 1 - variaveis
		int ladoA;
		int ladoB;
		int ladoC;
		Scanner leia = new Scanner(System.in);
		
		// 2 - entrada de dados
		System.out.print("Digite o tamanho do lado A: ");
		ladoA = leia.nextInt();
		
		System.out.print("Digite o tamanho do lado B: ");
		ladoB = leia.nextInt();
		
		System.out.print("Digite o tamanho do lado C: ");
		ladoC = leia.nextInt();
	
		// 3 - calculos
		if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
			System.out.println("Nao eh triangulo!");
		} else if (ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Triangulo equilatero!");
		} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("Triangulo isoceles!");
		} else {
			System.out.println("Triangulo escaleno!");
		}
		
	}

}
