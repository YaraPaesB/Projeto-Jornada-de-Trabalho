/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class TestePonto {
    
    @Test
    public void Teste1Ponto() {
        
        HorarioJornada horarioJornada = new HorarioJornada(null,  LocalTime.of(8, 0), LocalTime.of(18, 0), 1);
        HorarioJornada horarioJornadaAdicional = new HorarioJornada(null,  LocalTime.of(18, 0), LocalTime.of(22, 0), 1.5f);
        Jornada jornada;
        jornada = new Jornada(null, "Teste", List.of(horarioJornada, horarioJornadaAdicional));
        Ponto ponto = new Ponto(
                null, 
                LocalDateTime.of(LocalDate.of(2024, Month.MARCH, 18), LocalTime.of(8, 0)), 
                LocalDateTime.of(LocalDate.of(2024, Month.MARCH, 19), LocalTime.of(22, 0)), 
                jornada
        );
        float horas = ponto.CalcHorasTrabalhadas();
        assertEquals(horas, 16f, 0);
    }
}
