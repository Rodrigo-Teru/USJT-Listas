package lista_de_exercicios1;
    
import javax.swing.JOptionPane;

public class Exercício1 {

    public static void main(String[] args) {
        
        double a, b, c, d;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
        
        d = a*b*c;
        
        JOptionPane.showMessageDialog(null,"O resultado foi:" + d);
    }
}