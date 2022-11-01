package lab3_Shkraba_ki34;
public class Grapnel
{
    private double maxWeight;
    private double length;

    public Grapnel(double maxWeight, double length) {
        this.maxWeight = maxWeight;
        this.length = length;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Grapnel{ " +
                "maxWeight = " + maxWeight +
                ", length = " + length +
                '}';
    }
}
