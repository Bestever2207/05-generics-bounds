package ohm.softa.a05.model;

public class Flower extends Plant{
    private PlantColor color;

    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name);
        if(color == PlantColor.GREEN){

        }
        this.color = color;
    }


    public PlantColor getColor(){
        return color;
    }
}
