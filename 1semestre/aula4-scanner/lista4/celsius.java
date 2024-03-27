package Lista4;

import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celsius");
		int cel = info.nextInt();
		int fah = (9*cel + 160)/5;
		
		System.out.printf("a sua temperatura em fahrenthiet é %d", fah);

	}

}
