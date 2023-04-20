/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.mycompany.sportforecast.Pronostico;

public class PronosticoTest {
    
    @Test
    public void pronosticoClassTest() {
        int idPronostico = 1;
        int idParticipante = 2;
        int idPartido = 3;
        int idEquipo = 4;
        char resultado = 'E';
        Pronostico pronostico = new Pronostico(idPronostico, idParticipante, idPartido, idEquipo, resultado);
        
        assertEquals(idPronostico, pronostico.getIdPronostico());
        assertEquals(idParticipante, pronostico.getIdParticipante());
        assertEquals(idPartido, pronostico.getIdPartido());
        assertEquals(idEquipo, pronostico.getIdEquipo());
        assertEquals(resultado, pronostico.getResultado());
    }
}
