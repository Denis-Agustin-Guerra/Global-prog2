
package mvc;
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class Artista extends SerCantor{
    public String nombre;
    public ArrayList<Instrumento> usa;              
    public Artista(){};
    public Artista(ArrayList<Instrumento> usa) {        //CONSTRUCTOR PARA EL ATRIBUTO USA
        this.usa = usa;
    }
    public Artista(String nombre, ArrayList<Instrumento> usa) {         //CONSTRUCTOR SOBRECARGADO 
        this.nombre = nombre;
        this.usa = usa;
    }
    @Override
    public void cantar() {          //METODO CANTAR DONDE SE REPRODUCE EL SONIDO
        try {

            // Se obtiene un Clip de sonido
            Clip sonido = AudioSystem.getClip();

            // Se carga con un fichero wav
            sonido.open(AudioSystem.getAudioInputStream(new File("src\\sonidos\\gallo.wav")));

            // Comienza la reproducción
            sonido.start();

            // Espera mientras se esté reproduciendo.
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
    public boolean hacerCantar(){           //METODO HACER CANTAR 
        return true;
    }
}
