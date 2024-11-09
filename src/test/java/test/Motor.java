package test;

public class Motor{ 

    int numeroCilindros; 
    String tipo; 
    int registro; 


    public void cambiarRegistro(int numeroDeRegistroNuevoParaElMotor){ 

        this.registro=numeroDeRegistroNuevoParaElMotor; 
    
    }

    public void asignarTipo(String nuevoTipoParaElVehiculo){ 

        if(nuevoTipoParaElVehiculo.equalsIgnoreCase("gasolina")|| 
        
        nuevoTipoParaElVehiculo.equalsIgnoreCase("electrico")){ 

            this.tipo=nuevoTipoParaElVehiculo;

        }

    }

}
