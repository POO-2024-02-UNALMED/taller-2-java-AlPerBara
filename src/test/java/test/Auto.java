package test;

public class Auto { 
    
    String modelo; 
    int precio; 
    Asiento[] asientos; 
    String marca; 
    Motor motor; 
    int registro; 
    static String cantidadCreados; 


    public int cantidadAsientos(){
        
        int sillinContador=0; 

        for (Asiento objetoPorEvaluar: this.asientos){

            if((objetoPorEvaluar instanceof Asiento)&&(objetoPorEvaluar!=null)){ 
                sillinContador++; 

            }

        }

        return sillinContador;

    }

    public String verificarIntegridad(){ 

        boolean losAsientosEstanOk=true; 

        for (Asiento asientoPorVerificar : this.asientos){

            if ((asientoPorVerificar instanceof Asiento)&&(asientoPorVerificar!=null)){

                if (asientoPorVerificar.registro != this.registro){

                    losAsientosEstanOk=false;

                }

            }

        }

        if ((motor!=null)&&(motor.registro==this.registro)&&(losAsientosEstanOk==true)){

            return "Auto original";

        }

        else{
            
            return "Las piezas no son originales";
        }

    }

}
