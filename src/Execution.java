public class Execution {


            public static void main(String[] args){

            ElectricGuitar electricGuitar = new ElectricGuitar();
            ElectricBassGuitar electricBassGuitar = new ElectricBassGuitar();

            electricGuitar.play();
            electricBassGuitar.play();

            electricGuitar = new ElectricGuitar(7);
            electricBassGuitar =  new ElectricBassGuitar(5);

             electricGuitar.play();
             electricBassGuitar.play();


            }

}
