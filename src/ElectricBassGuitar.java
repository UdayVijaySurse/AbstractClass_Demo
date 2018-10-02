public class ElectricBassGuitar extends StringedInstruments {

    public ElectricBassGuitar(){
        super();
        this.name = "Bass Guitar";
        this.numberOfStrings = 4;

    }

    public ElectricBassGuitar(int numberOfString){
        super();
        this.name = "Bass Guitar";
        this.numberOfStrings = numberOfString;


    }

    @Override
    public void play(){
        System.out.println("An electric Bass Guitar" + numberOfStrings + "-string" + name + "is rocking!");

    }

}
