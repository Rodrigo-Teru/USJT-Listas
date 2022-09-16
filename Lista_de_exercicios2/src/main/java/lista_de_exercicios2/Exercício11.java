package lista_de_exercicios2;

import javax.swing.JOptionPane;

public class Exercício11 {

    public static void main(String[] args) {
        
        int a1, a2, m1, m2, d1, d2;
        
        d1 = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento da primeira pessoa"));
        
        m1 = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento da primeira pessoa"));
        
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento da primeira pessoa"));
        
        d2 = Integer.parseInt(JOptionPane.showInputDialog("Dia de nascimento da segunda pessoa"));
        
        m2 = Integer.parseInt(JOptionPane.showInputDialog("Mês de nascimento da segunda pessoa"));
        
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento da segunda pessoa"));
        
        if(a1 > a2){JOptionPane.showMessageDialog(null,"A data mais recente é: \n"+ d1 + "/" + m1 + "/" + a1);
        }
        
        else if(a2 > a1){JOptionPane.showMessageDialog(null,"A data mais recente é: \n"+ d2 + "/" + m2 + "/" + a2);
        }
        
        else if(m1 > m2){JOptionPane.showMessageDialog(null,"A data mais recente é: \n"+ d1 + "/" + m1 + "/" + a1);
        }
        
        else if(m2 > m1){JOptionPane.showMessageDialog(null,"A data mais recente é: \n"+ d2 + "/" + m2 + "/" + a2);
        }
        
        else if(d1 > d2){JOptionPane.showMessageDialog(null,"A data mais recente é: \n"+ d1 + "/" + m1 + "/" + a1);
        }
        
        else if(d2 > d1){JOptionPane.showMessageDialog(null,"A data mais recente é: \n"+ d2 + "/" + m2 + "/" + a2);
        }
        
        else{JOptionPane.showMessageDialog(null,"As datas são iguais: \n"+ d1 + "/" + m1 + "/" + a1 + "\n" + d2 + "/" + m2 + "/" + a2);
        }
    }
}