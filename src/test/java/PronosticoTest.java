/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.sportforecast.Participante;
import com.mycompany.sportforecast.Partido;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.mycompany.sportforecast.Pronostico;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;

public class PronosticoTest {
    private List<Pronostico> pronosticos;
    
    @Before
    public void setup(){
        pronosticos = new ArrayList<>();
    }
    
    @Test
    public void testTodosAciertos() {
        Participante participante = new Participante(1, "Agustin");
        
        Pronostico pronostico1 = generarPronostico(participante, 1, 1, 'G');
        pronosticos.add(pronostico1);
        Pronostico pronostico2 = generarPronostico(participante, 2, 1, 'P');
        pronosticos.add(pronostico2);
        participante.setPronosticos(pronosticos);
        
        assertEquals(2, participante.getScorePronostico());
    }
    
    @Test
    public void testTodasFallas() {
        Participante participante = new Participante(1, "Agustin");
        
        Pronostico pronostico1 = generarPronostico(participante, 1, 1, 'E');
        pronosticos.add(pronostico1);
        Pronostico pronostico2 = generarPronostico(participante, 2, 1, 'G');
        pronosticos.add(pronostico2);
        participante.setPronosticos(pronosticos);
        
        assertEquals(0, participante.getScorePronostico());
    }
    
    @Test
    public void testUnAcierto() {
        Participante participante = new Participante(1, "Agustin");
        
        Pronostico pronostico1 = generarPronostico(participante, 1, 1, 'G');
        pronosticos.add(pronostico1);
        Pronostico pronostico2 = generarPronostico(participante, 2, 2, 'P');
        pronosticos.add(pronostico2);
        participante.setPronosticos(pronosticos);
        
        assertEquals(1, participante.getScorePronostico());
    }
    
    private Pronostico generarPronostico(Participante participante, int idPartido, int idEquipo, char resultado){
        return new Pronostico(pronosticos.size()+1, participante.getIdParticipante(), idPartido, idEquipo, resultado); 
    }
}



/*import org.junit.Test;
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
}*/
