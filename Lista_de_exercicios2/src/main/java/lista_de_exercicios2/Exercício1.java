package lista_de_exercicios2;

import javax.swing.JOptionPane;

public class Exercício1 {
    public static void main(String[] args)  {
        
         double a, b, c, d;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite nota P1"));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite nota P2"));
        
        c = (a + b)/2 ;
        if (c > 6){JOptionPane.showMessageDialog(null,"Foi Aprovado:");
        }else{JOptionPane.showMessageDialog(null,"Foi Reprovado:");}
    }
}