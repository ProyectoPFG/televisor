/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1-DAM
 */
public class TV {
    byte estado = 0;
    byte canal = 1;
    
    public void encender(){
        estado = 1;
    }
    
    public void apagar(){
        estado = 0;
    }
    
    public void subirCanal(){
        canal++;
    }
    
    public void bajarCanal(){
        canal--;
        canal++;
    }
}
