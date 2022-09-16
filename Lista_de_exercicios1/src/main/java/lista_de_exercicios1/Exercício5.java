package lista_de_exercicios1;

import javax.swing.JOptionPane;

public class Exercício5 {
    public static void main(String[] args)  {
        
         double a, b, c;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do retângulo"));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do retângulo"));
        
        c = a * b ;
        
        JOptionPane.showMessageDialog(null,"A área do retângulo:" + c);
    }
}