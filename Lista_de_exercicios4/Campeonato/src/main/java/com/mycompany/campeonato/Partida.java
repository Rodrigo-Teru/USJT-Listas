package com.mycompany.campeonato;

public class Partida {
     private String resultado;
     private String regiao;
     
     public Partida(String resultado, String ragiao){
        this.resultado = resultado;
        this.regiao = regiao;
        
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
    
    public void exibirPartida ()
    {
	System.out.printf("Resultado: %s / Região: %s \n",
            getResultado(),getRegiao());
    }
}
