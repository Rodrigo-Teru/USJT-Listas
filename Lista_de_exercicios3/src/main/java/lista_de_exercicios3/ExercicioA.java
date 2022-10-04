package lista_de_exercicios3;

import java.util.Scanner;

public class ExercicioA {
    
    public static void main(String[] args) {
        
        int num = 0, media, acumula, i;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número quantos numeros vc quer digitar: ");
        i = sc.nextInt();
        acumula = 0;   
        
        for(int n = 0; n<i; n++){
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            
            acumula += num;
        }
        media = acumula/i;
        
        System.out.println("Média: " + media);
    }
}
