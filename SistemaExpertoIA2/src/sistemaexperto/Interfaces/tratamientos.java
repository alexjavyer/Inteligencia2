/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaexperto.Interfaces;

/**
 *
 * @author ALEX JAVIER
 */
public class tratamientos {
     String mensaje = "";
     String espacio = "\n";   
    public String tratamiento(String enfermedad){
       
        if(enfermedad == "Bronquitis"){
            mensaje += "Bronquitis";
            mensaje += espacio;
            mensaje+="Tome ibuprofeno por 8 dias cada 8 horas si es "
                    +espacio+"menor de edad un comprimido de 200 mg "
                    +espacio+"adulto un comprimido de 500 mg"
                    +espacio;
                        
            mensaje += "Consulte a su medico si los sintomas persisten";
        }
        
        return mensaje;
    }
    
}
