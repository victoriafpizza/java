import java.util.Scanner;
import javax.swing.JOptionPane;
public class exe1 {	
	public static void main(String[] args) {	
		Scanner grava = new Scanner(System.in);		
		int n1, n2 , n3 , temp , i;
	String x  =	JOptionPane.showInputDialog(null ,"Digite o primeiro valor");		
		      n1 = Integer.parseInt(x);		
		  	 x  =	JOptionPane.showInputDialog(null ,"Digite o segundo valor");			
		      n2 = Integer.parseInt(x);		      
		      x  =	JOptionPane.showInputDialog(null ,"Digite o terceiro valor");				
		      n3 = Integer.parseInt(x);		
	    if(n1>n2 && n2 > n3 && n3 < n1 ){	    		    	
	    	JOptionPane.showMessageDialog(null ,n1 + "  " + n2 + "  " +  n3);
	}		
	    for(i =0 ; i <=3 ; i++){    	
	    	if(n1 < n2){
	    		temp=n1;
	    		n1 = n2;
	    		n2 = temp;    		
	    	}else if(n2 < n3){	    		
	    		temp=n2;
	    		n2 = n3;
	    		n3 = temp;
	    	}   	
	    }    
	    JOptionPane.showMessageDialog(null ,n1 + "  " + n2 + "  " +  n3);		
	}

}