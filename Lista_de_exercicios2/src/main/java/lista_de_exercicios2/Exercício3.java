package lista_de_exercicios2;

import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args)  {
        
         double a, b;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número "));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número "));
        
        if (a > b){JOptionPane.showMessageDialog(null,"" + a);
        }
        else if(a < b){JOptionPane.showMessageDialog(null,"" + b);
        }
        else{JOptionPane.showMessageDialog(null,"Os números são iguais");
        }
    } 
}