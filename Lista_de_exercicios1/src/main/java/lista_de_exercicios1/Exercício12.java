package lista_de_exercicios1;

import javax.swing.JOptionPane;


public class Exercício12 {
    public static void main(String[] args)  {
        
         int a, b, c;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano de nascimento"));
        
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        
        c = (b - a);
        
        JOptionPane.showMessageDialog(null,"Sua Idade é:" + c);
    }
}