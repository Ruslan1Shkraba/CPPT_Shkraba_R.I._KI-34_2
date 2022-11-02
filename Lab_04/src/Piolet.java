public class Piolet
{
    private String brand;
    private double length;

    public Piolet(String brand, double length) {
        this.brand = brand;
        this.length = length;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Piolet{ " +
                "brand = '" + brand + '\'' +
                ", length = " + length +
                '}';
    }
}
