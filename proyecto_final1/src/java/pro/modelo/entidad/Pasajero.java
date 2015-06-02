package pro.modelo.entidad;
// Generated 26/05/2015 09:40:05 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Pasajero generated by hbm2java
 */
public class Pasajero  implements java.io.Serializable {


     private String idPersona;
     private Set boletos = new HashSet(0);

    public Pasajero() {
    }

	
    public Pasajero(String idPersona) {
        this.idPersona = idPersona;
    }
    public Pasajero(String idPersona, Set boletos) {
       this.idPersona = idPersona;
       this.boletos = boletos;
    }
   
    public String getIdPersona() {
        return this.idPersona;
    }
    
    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }
    public Set getBoletos() {
        return this.boletos;
    }
    
    public void setBoletos(Set boletos) {
        this.boletos = boletos;
    }




}


