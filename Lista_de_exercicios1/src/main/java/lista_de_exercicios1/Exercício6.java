package lista_de_exercicios1;

import javax.swing.JOptionPane;

public class Exercício6 {
    public static void main(String[] args)  {
        
         double a, b, c, d;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Triângulo"));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Triângulo"));
        
        c = (a * b)/2;
        
        JOptionPane.showMessageDialog(null,"A área do triângulo:" + c);
    }
}