package Classes;


import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yarap
 */
public class HorarioJornada {
    private String id;
    LocalTime horaInicio;
    LocalTime horaFinal;
    float peso;

    public HorarioJornada(String id, LocalTime horaInicio, LocalTime horaFinal, float peso) {
        this.id = null;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.peso = peso;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getHorasTrabalhadasTurno(LocalTime horaEntrada, LocalTime horaSaida) {
        if(this.horaFinal.compareTo(horaEntrada) >= 0 && horaSaida.compareTo(this.horaInicio) <= 0) {
            return 0;
        }
        
        if(horaEntrada.compareTo(horaSaida) >= 0){
            var calcTempoEntrada = this.getHorasTrabalhadasTurno(horaEntrada, this.horaFinal);
            var calcTempoSaida = this.getHorasTrabalhadasTurno(this.horaInicio, horaSaida);
            return calcTempoEntrada + calcTempoSaida;
        }
        
        var calcHoraEntrada = this.horaInicio.compareTo(horaEntrada) <= 0 ? horaEntrada : this.horaInicio;
        var calcHoraSaida = this.horaFinal.compareTo(horaSaida) >= 0 ? horaSaida : this.horaFinal;

        var calculoMinutos = Duration.between(calcHoraEntrada, calcHoraSaida).toMinutes();
        var calculoHoras = calculoMinutos / 60f;
        
        return calculoHoras * this.peso;
    }
    
    
}
