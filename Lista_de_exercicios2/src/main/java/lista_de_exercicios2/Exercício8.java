package lista_de_exercicios2;

import javax.swing.JOptionPane;

public class Exercício8 {

    public static void main(String[] args) {
        
        double a1, a2, a3, b1, b2, b3, c1, c2, c3;
        
        a1 = Double.parseDouble(JOptionPane.showInputDialog("Altura do primeiro triângulo"));
        
        b1 = Double.parseDouble(JOptionPane.showInputDialog("Base do primeiro triângulo"));
        
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Altura do segundo triângulo"));
        
        b2 = Double.parseDouble(JOptionPane.showInputDialog("Base do segundo triângulo"));
        
        a3 = Double.parseDouble(JOptionPane.showInputDialog("Altura do terceiro triângulo"));
        
        b3 = Double.parseDouble(JOptionPane.showInputDialog("Base do terceiro triângulo"));
        
        c1 = (a1 * b1) / 2;
        
        c2 = (a2 * b2) / 2;
        
        c3 = (a3 * b3) / 2;
        
        if(c1 > c2 && c1 > c3){JOptionPane.showMessageDialog(null, "A maior área é a do primeiro triângulo:" + c1);
        }
        
        else if(c2 > c1 && c2 > c3){JOptionPane.showMessageDialog(null, "A maior área é a do segundo triângulo:" + c2);
        }
        
        else if(c3 > c1 && c3 > c2){JOptionPane.showMessageDialog(null, "A maior área é a do terceiro triângulo:" + c3);
        }
    }
}