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
public class Jornada {
    private String id;
    private String nome;
    private List<HorarioJornada> turnos;

    public Jornada(String id, String nome, List<HorarioJornada> turnos) {
        this.id = null;
        this.nome = nome;
        this.turnos = turnos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<HorarioJornada> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<HorarioJornada> turnos) {
        this.turnos = turnos;
    }
    
    
    
    
}