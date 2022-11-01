package lab3_Shkraba_ki34;
public class Rope
{
    private double length;
    private double thickness;

    public Rope(double length, double thickness)
    {
        this.length = length;
        this.thickness = thickness;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Rope{ " +
                "length = " + length +
                ", thickness = " + thickness +
                '}';
    }
}
