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
    String ID;
    String Nome;
    Jornada Jornada;
    List<Ponto> Pontos;

    public Funcionario(String ID, String Nome, Jornada Jornada, List<Ponto> Pontos) {
        this.ID = null;
        this.Nome = Nome;
        this.Jornada = Jornada;
        this.Pontos = Pontos;
    }

    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Jornada getJornada() {
        return Jornada;
    }

    public void setJornada(Jornada Jornada) {
        this.Jornada = Jornada;
    }

    public List<Ponto> getPontos() {
        return Pontos;
    }

    public void setPontos(List<Ponto> Pontos) {
        this.Pontos = Pontos;
    }
    
    
   
    
    
    
    
}
