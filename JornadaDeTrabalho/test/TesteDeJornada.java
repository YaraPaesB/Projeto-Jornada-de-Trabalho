/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Classes.*;
import java.time.LocalTime;
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
public class TesteDeJornada {
    
    @Test
    public void Teste1Jornada() {
        HorarioJornada testeJornada = new HorarioJornada(null,  LocalTime.of(8, 0), LocalTime.of(18, 0), 1);
        
        float horasTrabalhadas = testeJornada.getHorasTrabalhadasTurno(LocalTime.of(17, 0), LocalTime.of(9, 0));
        assertEquals(horasTrabalhadas, 2f, 0);
    }
}
