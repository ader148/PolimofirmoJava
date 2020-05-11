
package co.unicauca.tallerpolimorfismo.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ViajeIndividualTest {
    
    public ViajeIndividualTest() {
    }
    
    @Test
    public void testViajeIndividual() throws ParseException {
        System.out.println("Viaje individual");
        Viaje viaje = new ViajeIndividual("Popayán", "San Andres", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
        assertEquals("Popayán", viaje.getOrigen());
        assertEquals("San Andres", viaje.getDestino());
        assertEquals(4250000, viaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), viaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"), viaje.getFechaLlegada());
        assertEquals("Disfruta tu viaje individual", viaje.descripcion());
        assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        assertEquals("Cualquier método2 implementado en la clase base", viaje.cualquierMetodo2());

    }

    
}
