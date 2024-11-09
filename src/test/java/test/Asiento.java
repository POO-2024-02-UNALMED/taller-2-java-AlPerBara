package test;

public class Asiento { 

    String color; 
    int precio; 
    int registro; 

    public void cambiarColorDelAsiento (String colorNuevo){ 
        if(colorNuevo.equalsIgnoreCase("rojo")||colorNuevo.equalsIgnoreCase("verde")||
        colorNuevo.equalsIgnoreCase("amarillo")||colorNuevo.equalsIgnoreCase("negro")||
        colorNuevo.equalsIgnoreCase("blanco")){ 
        
            this.color=colorNuevo;

        }

    }

}
