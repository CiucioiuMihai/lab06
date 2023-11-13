package vehicul;

public abstract class Vehicle {

    private int speed;
    private String brand;
    private String model;
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }

    public Vehicle(){
        this.speed=0;
    }
    public abstract void speedUP();

    protected void printSpeedIncrease(String vehicleType,int speedIncrease){
        System.out.println(vehicleType +"a crescut viteza cu" +speedIncrease +" unitati");
    }
    public Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(int brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(int brand){
        this.brand=brand;
    }
}
