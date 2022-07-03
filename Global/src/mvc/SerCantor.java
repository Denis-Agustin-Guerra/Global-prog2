package mvc;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class SerCantor implements PuedeCantar{
    
    public String tipo;
    public String nombre;
    final String Nombre="";
    Calendar fechaActual = Calendar.getInstance();                  //ATRIBUTOS
    public Calendar fecha_de_nacimiento;
    public Momento cuando;
    public String canto;
    
    public void hacerCantar(SerCantor s){}
    
    public int calcular_edad(){       //METODO CALCULAR EDAD
        int edad;
        
        edad= fechaActual.get(Calendar.YEAR)-fecha_de_nacimiento.get(Calendar.YEAR);
        if(fechaActual.get(Calendar.MONTH)>fecha_de_nacimiento.get(Calendar.MONTH) || (fechaActual.get(Calendar.MONTH)==fecha_de_nacimiento.get(Calendar.MONTH) && fechaActual.get(Calendar.DAY_OF_MONTH)>fecha_de_nacimiento.get(Calendar.DAY_OF_MONTH))){
            edad--;
        }
        
        return edad;
        
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
