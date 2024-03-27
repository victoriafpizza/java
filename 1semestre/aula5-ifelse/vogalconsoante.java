package ifelse;
import java.util.Scanner;

public class vogalconsoante {

	    public static void main(String[] args) {
	        Scanner ver = new Scanner(System.in);
	        
	        System.out.print("Digite uma letra");
	        String letra = ver.nextLine();
        					// O sinal || significa "ou"
	       if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
	           System.out.print("Você digitou uma vogal");
	       } else {
	           System.out.print("Você digitou uma consoante");  
	     }
	}

}
