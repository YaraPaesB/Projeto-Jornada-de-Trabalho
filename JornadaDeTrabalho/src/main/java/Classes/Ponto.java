/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author yarap
 */
public class Ponto {
    String id;
    LocalDateTime horaEntrada;
    LocalDateTime horaSaida;
    Jornada jornada;

    public Ponto(String id, LocalDateTime horaEntrada, LocalDateTime horaSaida, Jornada jornada) {
        this.id = null;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.jornada = jornada;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }
    
    public float CalcHorasTrabalhadas() {
       final var turnos = this.jornada.getTurnos();
       var horasTotais = 0;
       
        for (HorarioJornada turno : turnos) {
            horasTotais += turno.getHorasTrabalhadasTurno(this.horaEntrada.toLocalTime(), this.horaSaida.toLocalTime());
        }
        return horasTotais;
    }
    
    
    

}
