import javax.swing.JOptionPane;
public class IMC{
    public static void main(String[] arg){
        double peso =0;
        double altura=0;
        String xpeso, xaltura;

            xaltura = JOptionPane.showInputDialog("Qual sua altura?");
            xpeso = JOptionPane.showInputDialog("Qual seu peso?");

            altura = Double.parseDouble(xaltura);
            peso = Double.parseDouble(xpeso);
            double imc = peso / (altura * altura);
    
    JOptionPane.showMessageDialog(null, "seu imc é"+ imc);

    if (Imc<18.5){
        JOptionPane.showMessageDialog(null,"Voce está abaixo do peso...");
        }else if(imc<25){
        JOptionPane.showMessageDialog(null,"Esta no peso normal");
        }else if(imc<30){
            JOptionPane.showMessageDialog(null,"Acima do peso...");
        }else{
            JOptionPane.showMessageDialog(null,"Voce está enorme...");
        }

        System.exit(0);
        
    }
}