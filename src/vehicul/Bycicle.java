package vehicul;

public class Bycicle  extends Vehicle {
    private static final int SPEED_INCREASE =10;
    public Bycicle(String brand,String model){
        super(brand, model);
    }

    @Override
    public void speedUP(){
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed+SPEED_INCREASE);
        printSpeedIncrease("Bicicleta",SPEED_INCREASE);
    }
}

