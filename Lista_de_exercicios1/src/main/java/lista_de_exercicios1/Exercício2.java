package lista_de_exercicios1;

import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main(String[] args)  {
        
         double a, b, c, d;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite nota P1"));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite nota P2"));
        
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite nota P3"));
        
        d = (a*3 + b*3 + c*4)/10 ;
        
        JOptionPane.showMessageDialog(null,"Sua média foi:" + d);
    }
}