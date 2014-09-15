/**
 * Created by BFineRocks on 9/15/14.
 */

/**
 * This class creates a blue print for a car object.
 */
public class Car {
    private String carColor;
    private String carModel;
    private int carMPG;

    public void setCarColor (String myCarColor)
    {
        carColor = myCarColor;
    }

    public void setCarModel (String myCarModel)
    {
        carModel = myCarModel;
    }

    public void setCarMPG (int myCarMPG)
    {
        carMPG = myCarMPG;
    }

    public String getCarColor()
    {
        return carColor;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public int getCarMPG()
    {
        return carMPG;
    }

}
