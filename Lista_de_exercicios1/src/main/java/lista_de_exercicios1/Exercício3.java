package lista_de_exercicios1;

import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args)  {
        
         double a, b, c;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual"));
        
        b = a/4;
        
        c = a + b;
        
        JOptionPane.showMessageDialog(null,"Seu novo salário:" + c);
    }
}
