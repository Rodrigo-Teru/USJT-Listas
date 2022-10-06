package com.mycompany.campeonato;

public class Times {
    private String nome;
    private String capitao;
    
    public Times(String nome, String capitão){
        this.nome = nome;
        this.capitao = capitao;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapitao() {
        return capitao;
    }

    public void setCapitao(String capitao) {
        this.capitao = capitao;
    }
    
    public void exibirTime (){
	System.out.printf("Nome: %s / Capitão: %s \n",
            getNome(), getCapitao());
	}


}
