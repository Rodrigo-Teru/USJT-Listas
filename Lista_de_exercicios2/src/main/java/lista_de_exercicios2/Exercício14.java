package lista_de_exercicios2;

import javax.swing.JOptionPane;

public class Exercício14 {

    public static void main(String[] args) {
        
        Double a;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Idade"));
        
        if(a > 35){JOptionPane.showMessageDialog(null,"Vc pertence a categoria Master");
        }
        
        else if(a > 20){JOptionPane.showMessageDialog(null, "Vc pertence a categoria Jovem");
        }
        
        else if(a > 14) {JOptionPane.showMessageDialog(null, "Vc pertence a categoria Adolescente");
        }
        
        else if(a > 10) {JOptionPane.showMessageDialog(null, "Vc pertence a categoria Junior");
        }
        
        else if(a >= 0) {JOptionPane.showMessageDialog(null,"Vc pertence a categoria Infantil");
        }
    }
}