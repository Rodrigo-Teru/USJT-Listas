package com.mycompany.campeonato;

import java.util.Scanner;

public class TesteCampeonato {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        String nome1 = sc.nextLine();
        System.out.println("");
        String capitao1 = sc.nextLine();
        
        sc.nextLine();
        
        System.out.println();
        String nome2 = sc.nextLine();
        System.out.println();
        String capitao2 = sc.nextLine();
        
        sc.nextLine();
        
        System.out.println();
        String resultado = sc.nextLine();
        System.out.println();
        String regiao = sc.nextLine();
        
        Times time1 = new Times(nome1, capitao1);
        sc.nextInt();
        Times time2 = new Times(nome2, capitao2);
        sc.nextInt();
        Partida partida = new Partida(resultado, regiao);
        
        time1.exibirTime();
        time2.exibirTime();
        partida.exibirPartida();
        
    }
    
}
