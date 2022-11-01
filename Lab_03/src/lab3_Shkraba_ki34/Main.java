package lab3_Shkraba_ki34;
public class Main {
    public static void main(String[] args) {
        MountaineeringEquipment mountaineeringEquipment = new MountaineeringEquipment(
                new Grapnel(121.3, 45),
                new Piolet("Brand", 32.1),
                new Rope(37.4, 2), "New Brand", 4500);

        mountaineeringEquipment.IsEquipmentHoldUp(130);
        mountaineeringEquipment.ThrowTheHook(37);
        System.out.println(mountaineeringEquipment);
    }
}