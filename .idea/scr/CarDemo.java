/**
 * Created by BFineRocks on 9/15/14.
 */
public class CarDemo {
    public static void main(String[] args){
        Car myNewCar = new Car();
        myNewCar.setCarColor("red");
        myNewCar.setCarModel("Sorento");
        myNewCar.setCarMPG(20);

        System.out.println("My new car is a " + myNewCar.getCarModel() + " and it is " + myNewCar.getCarColor() + " AND" +
                " it gets " + myNewCar.getCarMPG() + " miles per gallon!");
    }
}
