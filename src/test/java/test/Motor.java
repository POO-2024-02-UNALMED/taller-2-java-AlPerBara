package test;

public class Motor{ //Clase motor

    int numeroCilindros; //Cantidad de cilindros del motor
    String tipo; //tipo de vehículo, eléctrico o a gasolina
    int registro; //registro del motor


    public void cambiarRegistro(int numeroDeRegistroNuevoParaElMotor){ 

        this.registro=numeroDeRegistroNuevoParaElMotor; //Esto permite realizar el cambio del nro de registro del motor
    
    }

    public void asignarTipo(String nuevoTipoParaElVehiculo){ //La policía me busca por ponerle nombres largos a las variables

        if(nuevoTipoParaElVehiculo.equalsIgnoreCase("gasolina")|| //Motor a gasolina
        //nuevoTipoParaElVehiculo.equalsIgnoreCase("eléctrico")|| //Eléctrico con tilde
        nuevoTipoParaElVehiculo.equalsIgnoreCase("electrico")){ //electrico sin tilde

            this.tipo=nuevoTipoParaElVehiculo;

        }

    }

}

            /*
                    Shhh🤫🤫...   Déjenlo dormir...

                      |\      _,,,---,,_
                ZZZzz /,`.-'`'    -.  ;-;;,_
                     |,4-  ) )-,_. ,\ (  `'-'
                    '---''(_/--'  `-'\_)

             */