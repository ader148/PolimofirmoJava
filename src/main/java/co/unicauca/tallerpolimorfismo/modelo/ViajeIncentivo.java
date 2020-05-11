

package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

public class ViajeIncentivo extends Viaje {
    /**
    * Empresa que patrocina el viaje al empleado
    */
    private String empresa;
    
    public ViajeIncentivo(){}
    
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa){
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa = empresa;
    }
    
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }

    public String getEmpresa(){
        return empresa;
    }
    
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
}