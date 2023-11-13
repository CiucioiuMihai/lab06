package vehicul;

public class Car extends Vehicle {

        public static final int SPEED_INCREASE =50;
        public Car(String brand,String model){
            super(brand, model);
        }
        @Override
    public void speedUP(){
            int currentSpeed =getSpeed();
            setSpeed(currentSpeed+SPEED_INCREASE);
            printSpeedIncrease("Masina",SPEED_INCREASE);
        }
        public static String

}
