public class MilitaryMountaineeringEquipment extends MountaineeringEquipment implements TakeWeapon
{

    /**
     * Constructor
     *
     * @param grapnel
     * @param piolet
     * @param rope
     * @param brand
     * @param price
     */
    public MilitaryMountaineeringEquipment(Grapnel grapnel, Piolet piolet, Rope rope, String brand, double price) {
        super(grapnel, piolet, rope, brand, price);
        logger.log(logger.infoFlag + "MilitaryMountaineeringEquipment was called");
    }

    /**
     * Overrided method to throw hook
     * @param length
     */
    @Override
    public void ThrowTheHook(double length) {
        logger.log(logger.infoFlag + "MilitaryMountaineeringEquipment method throw hook was called");
        if(length <= rope.getLength())
        {
            System.out.println("You have enough rope to throw hook");
        }
        else
        {
            System.out.println("Your rope is short to throw hook");
        }
    }

    @Override
    public void IsEquipmentHoldUp(double weight) {
        logger.log(logger.infoFlag + "MilitaryMountaineeringEquipment method IsEquipmentHoldUp  was called");
        if(grapnel.getMaxWeight() >= weight)
        {
            System.out.println("Equipment hold up you");
        }
        else
        {
            System.out.println("Equipment don't hold up you");
        }

    }

    /**
     * Implemented intarface
     * @param weight
     * @return
     */
    @Override
    public double TakeWeapon(double weight) {
        logger.log(logger.infoFlag + "MilitaryMountaineeringEquipment method TakeWeapon  was called");
        return weight + 20;
    }

    @Override
    public String toString() {
        return "MilitaryMountaineeringEquipment: \n" +
                "grapnel=" + grapnel +
                "\npiolet=" + piolet +
                "\nrope=" + rope +
                "\nbrand='" + brand + '\'' +
                "\nprice=" + price;
    }
}
