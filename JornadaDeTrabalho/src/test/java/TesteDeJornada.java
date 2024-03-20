/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Classes.*;
import java.time.LocalTime;
/**
 *
 * @author yarap
 */
public class TesteDeJornada {
    
    @Test
    public void Teste1Jornada() {
        var testeJornada = new HorarioJornada(null,  LocalTime.of(8, 0), LocalTime.of(18, 0), 1);
        
        var horasTrabalhadas = testeJornada.getHorasTrabalhadasTurno(LocalTime.of(17, 0), LocalTime.of(9, 0));
        assertEquals(horasTrabalhadas, 2f);
    }
    
}
