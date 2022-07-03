
package mvc;
public class Momento {
    public String tipo;
    private boolean alegria;
    
    public String horario(int h){
        String momento="";
        if(h<12){
            momento="Mañana";
        }else if(h>12 && h<20){             //MOMENTO DEL DIA QUE CANTA
            momento= "Tarde";
        }else{
            momento="Noche";
        }
            
        return momento;
    }
}
