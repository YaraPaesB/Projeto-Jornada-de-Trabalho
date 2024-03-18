/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.Date;

/**
 *
 * @author yarap
 */
public class Ponto {
    String ID;
    Date HoraEntrada;
    Date HoraSaida;
    Jornada Jornada;

    public Ponto(String ID, Date HoraEntrada, Date HoraSaida, Jornada Jornada) {
        this.ID = null;
        this.HoraEntrada = HoraEntrada;
        this.HoraSaida = HoraSaida;
        this.Jornada = Jornada;
    }

    public Date getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(Date HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }

    public Date getHoraSaida() {
        return HoraSaida;
    }

    public void setHoraSaida(Date HoraSaida) {
        this.HoraSaida = HoraSaida;
    }

    public Jornada getJornada() {
        return Jornada;
    }

    public void setJornada(Jornada Jornada) {
        this.Jornada = Jornada;
    }
    
    public float CalcHorasTrabalhadas() {
       final var turnos = this.Jornada.getTurnos();
       
        for (HorarioJornada turno : turnos) {
            
        }
    }
    
    
    

}
