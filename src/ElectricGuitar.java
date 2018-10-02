public class ElectricGuitar extends StringedInstruments {

    public ElectricGuitar(){

        super();
        this.name = "Guitar";
        this.numberOfStrings = 6;


    }

    public ElectricGuitar(int numberOfString){
            super();
            this.name = "Guitar";
            this.numberOfStrings = numberOfString;

    }


    @Override
    public void play(){
        System.out.println("An electric" + numberOfStrings + "-string" + name + "is rocking!");

    }

}
