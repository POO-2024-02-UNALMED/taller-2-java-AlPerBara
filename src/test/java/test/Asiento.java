package test;

public class Asiento { //Clase Asiento

    String color; //Color del sillín
    int precio; //Precio y detalles 🧐🧐
    int registro; //Número de serie

    public void cambiarColorDelAsiento (String colorNuevo){ //Esto es para cambiar el color de la silla
        //rojo, verde, amarillo, negro y blanco,
        if(colorNuevo.equalsIgnoreCase("rojo")||colorNuevo.equalsIgnoreCase("verde")||
        colorNuevo.equalsIgnoreCase("amarillo")||colorNuevo.equalsIgnoreCase("negro")||
        colorNuevo.equalsIgnoreCase("blanco")){ //Estos tres renglones comparan el color con los 5 colores que están permitidos usando el OR
        
            this.color=colorNuevo; //Si el color está permitido, se cambia el color del asiento.

        }

    }

}

            /*   
                 Glug glug glug 💧🐟

                   ;,//;,    ,;/
                  o:::::::;;///
                 >::::::::;;\\\
                   ''\\\\\'" ';\ 

             */