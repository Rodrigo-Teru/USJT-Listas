package lista_de_exercicios3;

import javax.swing.JOptionPane;

public class ExercicioQ {
    
    public static void main(String[] args) {
        
        float contador, trigo, total;
        
        trigo = 1;
        total = 1;
        contador = 1;
        
        while(contador != 64){
            trigo = trigo * 2;
            total = total + trigo;
            contador++;
        }
        JOptionPane.showMessageDialog(null,"O pagamento do que a rainha realizara ao monge será de " + total + " grãos de trigo");
    }
}
