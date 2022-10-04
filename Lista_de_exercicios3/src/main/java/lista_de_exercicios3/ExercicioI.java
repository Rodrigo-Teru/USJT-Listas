package lista_de_exercicios3;

import java.util.Scanner;

public class ExercicioI {
    
    public static void main(String[] args) {
        
        float n, result;
        int m;
        
        result = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número Natural");
        n = sc.nextFloat();
        
        System.out.println("Digite um número Real: ");
        m = sc.nextInt();
        
        for(int i=0; i < m; i++){
            result*= n;
            
            System.out.println("Resultado" + result);
            
        }
        
        
        System.out.println();
    }
}
