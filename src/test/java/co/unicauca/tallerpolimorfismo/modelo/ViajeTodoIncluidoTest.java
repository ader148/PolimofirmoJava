
package co.unicauca.tallerpolimorfismo.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ViajeTodoIncluidoTest {
    
    public ViajeTodoIncluidoTest() {
    }

     /**
     * Test de la clase ViajeTodoIncluido.
     *
     * @throws java.text.ParseException
     */
    @Test
    public void testViajeTodoIncluido() throws ParseException {
        System.out.println("Viaje todo incluido");
        Viaje viaje = new ViajeTodoIncluido("Popayán", "Cartagena", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        assertEquals("Popayán", viaje.getOrigen());
        assertEquals("Cartagena", viaje.getDestino());
        assertEquals(7350000, viaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), viaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"), viaje.getFechaLlegada());
        assertEquals("Disfruta tu viaje todo incluido", viaje.descripcion());
        assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        assertEquals("Cualquier método2 implementado en la clase base", viaje.cualquierMetodo2());
    }

    
}
