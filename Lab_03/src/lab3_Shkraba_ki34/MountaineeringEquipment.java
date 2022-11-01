package lab3_Shkraba_ki34;
/**
 * Class
 * @author
 * @version 1.0
 */
public class MountaineeringEquipment
{
    private Grapnel grapnel;
    private Piolet piolet;
    private Rope rope;
    private String brand;
    private double price;
    private Logger logger = Logger.getLogger("logs.txt");

    /**
     * Constructor
     * @param grapnel
     * @param piolet
     * @param rope
     * @param brand
     * @param price
     */
    public MountaineeringEquipment(Grapnel grapnel, Piolet piolet, Rope rope, String brand, double price) {
        this.grapnel = grapnel;
        this.piolet = piolet;
        this.rope = rope;
        this.brand = brand;
        this.price = price;
    }

    /**
     * Method to throw hook
     * @param length
     */
    public void ThrowTheHook(double length)
    {
        if(length <= rope.getLength())
        {
            System.out.println("You have enough rope to throw hook");
        }
        else
        {
            System.out.println("Your rope is short to throw hook");
        }
    }

    /**
     * Method to check is equipment hold up
     * @param weight
     */
    public void IsEquipmentHoldUp(double weight)
    {
        if(grapnel.getMaxWeight() >= weight)
        {
            System.out.println("Equipment hold up you");
        }
        else
        {
            System.out.println("Equipment don't hold up you");
        }
    }

    public Grapnel getGrapnel() {
        return grapnel;
    }

    public void setGrapnel(Grapnel grapnel) {
        this.grapnel = grapnel;
    }

    public Piolet getPiolet() {
        return piolet;
    }

    public void setPiolet(Piolet piolet) {
        this.piolet = piolet;
    }

    public Rope getRope() {
        return rope;
    }

    public void setRope(Rope rope) {
        this.rope = rope;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "MountaineeringEquipment: \n" +
                "grapnel = " + grapnel +
                "\npiolet = " + piolet +
                "\nrope = " + rope +
                "\nbrand = '" + brand + '\'' +
                "\nprice = " + price;
    }
}
