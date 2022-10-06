package com.mycompany.copa;

import java.util.Scanner;

public class TesteJogadores {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do Jogador: ");
        String nome1 = sc.nextLine();
        System.out.println("Seleção do Jogador: ");
        String selecao1 = sc.nextLine();
        System.out.println("Número do Jogador: ");
        int numero1 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("Nome do Jogador: ");
        String nome2 = sc.nextLine();
        System.out.println("Seleção do Jogador: ");
        String selecao2 = sc.nextLine();
        System.out.println("Número do Jogador: ");
        int numero2 = sc.nextInt();
        
        Jogadores jogador1 = new Jogadores(selecao1, numero1, nome1);
        sc.nextInt();
        Jogadores jogador2 = new Jogadores(selecao2, numero2, nome2);
        
        jogador1.exibirMensagem();
        sc.nextInt();
        jogador2.exibirMensagem();
        
        
        
    }
    
    
}
