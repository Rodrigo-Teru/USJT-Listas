package lista_de_exercicios2;

import javax.swing.JOptionPane;


public class Exercício13 {

    public static void main(String[] args) {
        
        int a;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cilindradas(cc)"));
        
        if(a > 240){JOptionPane.showMessageDialog(null, "Sua categoria é Super Production");
        }
        
        else if(a > 120){JOptionPane.showMessageDialog(null, "Sua categoria é Production");
        }
        
        else if(a >= 0 ){JOptionPane.showMessageDialog(null, "Sua categoria é Sub Production");
        }
    }
}