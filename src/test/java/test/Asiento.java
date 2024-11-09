package test;

public class Asiento { 

    String color; 
    int precio; 
    int registro; 

    public void cambiarColorDelAsiento (String colorNuevo){ 
        if(colorNuevo.equals("rojo")||colorNuevo.equals("verde")||
        colorNuevo.equals("amarillo")||colorNuevo.equals("negro")||
        colorNuevo.equals("blanco")){ 
        
            this.color=colorNuevo;

        }

    }

}
