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
    String ID;
    String Nome;
    List<HorarioJornada> Turnos;

    public Jornada(String ID, String Nome, List<HorarioJornada> Turnos) {
        this.ID = null;
        this.Nome = Nome;
        this.Turnos = Turnos;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public List<HorarioJornada> getTurnos() {
        return Turnos;
    }

    public void setTurnos(List<HorarioJornada> Turnos) {
        this.Turnos = Turnos;
    }
    
    
    
    
}
