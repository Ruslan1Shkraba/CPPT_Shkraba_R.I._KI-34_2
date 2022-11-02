/**
 * Class
 * @author
 * @version 1.0
 */
public abstract class MountaineeringEquipment
{
    protected Grapnel grapnel;
    protected Piolet piolet;
    protected Rope rope;
    protected String brand;
    protected double price;
    protected Logger logger = Logger.getLogger("logs.txt");

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
    public  abstract void ThrowTheHook(double length);

    /**
     * Method to check is equipment hold up
     * @param weight
     */
    public abstract void IsEquipmentHoldUp(double weight);

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
