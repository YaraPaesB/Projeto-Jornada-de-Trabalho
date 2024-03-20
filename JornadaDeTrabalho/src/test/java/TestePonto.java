/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


import Classes.HorarioJornada;
import Classes.Jornada;
import Classes.Ponto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yarap
 */
public class TestePonto {
    @Test
    public void Teste1Ponto() {
        
        var horarioJornada = new HorarioJornada(null,  LocalTime.of(8, 0), LocalTime.of(18, 0), 1);
        var jornada = new Jornada(null, "Teste", List.of(horarioJornada));
        var ponto = new Ponto(
                null, 
                LocalDateTime.of(LocalDate.of(2024, Month.MARCH, 18), LocalTime.of(17, 0)), 
                LocalDateTime.of(LocalDate.of(2024, Month.MARCH, 19), LocalTime.of(9, 0)), 
                jornada
        );
        var horas = ponto.CalcHorasTrabalhadas();
        assertEquals(horas, 2);
    }
}
