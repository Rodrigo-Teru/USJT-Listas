package lista_de_exercicios3;

import javax.swing.JOptionPane;

public class ExercicioE {
    
    public static void main(String[] args) {
        
        int cont, num, result;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da tabuada que deseja descobrir?"));
        
        for (cont = 0; cont <=10; cont++){
            result = cont * num;
            System.out.println(num + " x " + cont + " = " + result);
        }
    }
}
