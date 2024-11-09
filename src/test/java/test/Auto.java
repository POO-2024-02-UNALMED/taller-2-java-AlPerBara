package test;

public class Auto { //Clase del car
    
    String modelo; //Modelo del automotor
    int precio; //Detalles y costos 👀👀🍷
    Asiento[] asientos; //Array con cantidad de asientos
    String marca; //¿VolksWagen o Rolls Royce?
    Motor motor; //El motor del vehículo
    int registro; //Número de identificación del kuruma
    static String cantidadCreados; //Raro que se almacene en un String, pero así sale en el tablero de Classroom


    public int cantidadAsientos(){
        
        int sillinContador=0; //Empieza contando 0 asientos

        for (Asiento objetoPorEvaluar: this.asientos){

            if((objetoPorEvaluar instanceof Asiento)&&(objetoPorEvaluar!=null)){ //Si es un asiento...
                sillinContador++; //Sume uno al conteo de asientos

            }

        }

        return sillinContador; //Devolver el total de asientos que pudo contar

    }

    public String verificarIntegridad(){ //Verificar que tan genuino es el auto

        boolean losAsientosEstanOk=true; //Esta variable va a servir para guardar si los asientos son genuinos o no, se asume que si

        for (Asiento asientoPorVerificar : this.asientos){

            if ((asientoPorVerificar instanceof Asiento)&&(asientoPorVerificar!=null)){

                if (asientoPorVerificar.registro != this.registro){

                    losAsientosEstanOk=false;

                }

            }

        }

        if ((motor!=null)&&(motor.registro==this.registro)&&(losAsientosEstanOk==true)){ //Verificar que el motor no sea nulo, y que su id coincida con la del auto

            return "Auto original"; //Si ambas ids coinciden, y encima los asientos son genuinos, el auto es original

        }

        else{
            
            return "Las piezas no son originales"; //Sino toca discutir la situacion con yaper

        }

    }

}

            /*

                                 Prefiero C++ 😢🏳☕🔷

                                      (
                                        )     (
                                 ___...(-------)-....___
                             .-""       )    (          ""-.
                       .-'``'|-._             )         _.-|
                      /  .--.|   `""---...........---""`   |
                     /  /    |                             |
                     |  |    |                             |
                      \  \   |                             |
                       `\ `\ |                             |
                         `\ `|                             |
                         _/ /\                             /
                        (__/  \                           /
                     _..---""` \                         /`""---.._
                  .-'           \                       /          '-.
                 :               `-.__             __.-'              :
                 :                  ) ""---...---"" (                 :
                  '._               `"--...___...--"`              _.'
                    \""--..__                              __..--""/
                     '._     """----.....______.....----"""     _.'
                        `""--..,,_____            _____,,..--""`
                                      `"""----"""`

             */