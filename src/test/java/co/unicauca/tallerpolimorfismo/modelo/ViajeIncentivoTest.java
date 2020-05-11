
package co.unicauca.tallerpolimorfismo.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ViajeIncentivoTest {
    
    public ViajeIncentivoTest() {
    }

    /**
     * Test of descripcion method, of class ViajeIncentivo.
     */
    
    @Test
    public void testViajeIncentivo() throws ParseException {
        System.out.println("Viaje incentivo");
        ViajeIncentivo viaje = new ViajeIncentivo("Popayán", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
        assertEquals("Popayán", viaje.getOrigen());
        assertEquals("Medellin", viaje.getDestino());
        assertEquals(2100000, viaje.getCosto());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), viaje.getFechaSalida());
        assertEquals(new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), viaje.getFechaLlegada());
        assertEquals("Emtel", viaje.getEmpresa());
        assertEquals("Viaje incentivo que te envia la empresa Emtel", viaje.descripcion());
        assertEquals("Cualquier método implementado en la clase base", viaje.cualquierMetodo());
        assertEquals("Método implementado en la clase hija viaje de incentivo", viaje.cualquierMetodo2());
    }

    
    
}
