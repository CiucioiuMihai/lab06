import vehicul.Bycicle;
import vehicul.Car;
import vehicul.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car car1 =new Car("bmw","e92");
        Car car2 =new Car("vw","golf");
        Car car3 =new Car("opel","astra");
        Bycicle bycicle1 =new Bycicle("asifji","8149");
        Bycicle bycicle2 =new Bycicle("aosbuih","298347");
        Bycicle bycicle3 =new Bycicle("ashdu","234872");

       Car car =new Car();
        Bycicle bycicle=new Bycicle();

        car.speedUP();
        bycicle.speedUP();

    }
}
