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
    private String ID;
    LocalTime HoraInicio;
    LocalTime HoraFinal;
    float Peso;

    public HorarioJornada(String ID, LocalTime HoraInicio, LocalTime HoraFinal, float Peso) {
        this.ID = null;
        this.HoraInicio = HoraInicio;
        this.HoraFinal = HoraFinal;
        this.Peso = Peso;
    }

    public LocalTime getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(LocalTime HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public LocalTime getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(LocalTime HoraFinal) {
        this.HoraFinal = HoraFinal;
    }

    public float getPeso() {
        return Peso;
    }

    public void setPeso(float Peso) {
        this.Peso = Peso;
    }
    
    public float getHorasTrabalhadasTurno(LocalTime horaEntrada, LocalTime horaSaida) {
        if(this.HoraFinal.compareTo(horaEntrada) >= 0 && horaSaida.compareTo(this.HoraInicio) <= 0) {
            return 0;
        }
        
        var calcHoraEntrada = this.HoraInicio.compareTo(horaEntrada) <= 0 ? horaEntrada : this.HoraInicio;
        var calcHoraSaida = this.HoraFinal.compareTo(horaSaida) >= 0 ? horaSaida : this.HoraFinal;

        var calculoHoras = Duration.between(calcHoraEntrada, calcHoraSaida).toMinutes() / 60;
        
        return calculoHoras * this.Peso;
    }
    
    
}
