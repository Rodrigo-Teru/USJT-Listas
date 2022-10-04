package lista_de_exercicios3;

import java.util.Scanner;

public class ExercicioO {
    
    public static void main(String[] args) {
        
        int num, numMaior = 0;
        
        Scanner sc = new Scanner(System.in);
        
        do
        {
                
            System.out.println("Digite um número ");
            num = sc.nextInt();
            if(num > numMaior){
            numMaior = num;
            }
        }
        while(num != 0);
        System.out.println("O número maior é: " + numMaior);
        
    }
}
