/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.List;

/**
 *
 * @author yarap
 */
public class Funcionario {
    String id;
    String nome;
    Jornada jornada;
    List<Ponto> pontos;

    public Funcionario(String id, String nome, Jornada jornada, List<Ponto> pontos) {
        this.id = null;
        this.nome = nome;
        this.jornada = jornada;
        this.pontos = pontos;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    public List<Ponto> getPontos() {
        return pontos;
    }

    public void setPontos(List<Ponto> pontos) {
        this.pontos = pontos;
    }
    
    
   
    
    
    
    
}
