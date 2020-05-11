
package co.unicauca.tallerpolimorfismo.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ViajeFamiliarTest {
    
    public ViajeFamiliarTest() {
    }

    /**
     * Test of descripcion method, of class ViajeFamiliar.
     */
    @Test
    public void testDescripcion() throws ParseException {
        System.out.println("Test Viaje familiar");
        ViajeFamiliar viaje = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
        assertEquals("Popayán", viaje.getOrigen());
        assertEquals("Bogotá", viaje.getDestino());
        assertEquals(1250000, viaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), viaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), viaje.getFechaLlegada());
        assertEquals(5, viaje.getFamilia());
        assertEquals("Viaje para disfrutar con toda tu familia", viaje.descripcion());
        assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        assertEquals("Método implementado en la clase hija viaje familiar", viaje.cualquierMetodo2());
    }

}
