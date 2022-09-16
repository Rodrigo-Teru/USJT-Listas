package lista_de_exercicios1;

import javax.swing.JOptionPane;

public class Exercício8 {
    public static void main(String[] args)  {
        
         double a, b, c;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite a distância percorrida em quilômetros(KM)"));
        
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de gasolina gasta em litros(L)"));
        
        c = b/a ;
        
        JOptionPane.showMessageDialog(null,"Seu carro gasta:" + c + "Litros de gasolina por quilômetro");
    }
}