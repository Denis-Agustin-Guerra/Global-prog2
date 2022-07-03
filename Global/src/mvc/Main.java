/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;


import interfaz.*;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<SerCantor> cantores = new ArrayList();
    
    //falta persistencia pelotudo
    
    var viewer = new Menu(cantores);
    viewer.setVisible(true);
    
    
    
    
    }
    
}
