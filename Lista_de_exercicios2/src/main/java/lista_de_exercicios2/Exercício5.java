package lista_de_exercicios2;

import javax.swing.JOptionPane;

public class Exercício5 {

    public static void main(String[] args) {
     
        int a;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite seu número"));
        
        if(a % 2 != 1){JOptionPane.showMessageDialog(null, "O número é Par");
        }
        
        else JOptionPane.showMessageDialog(null, "O número é Impar");
        }
    }