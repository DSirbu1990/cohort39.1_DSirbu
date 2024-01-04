package Student_code;

public class UsageSmartphone {
    public static void main(String[] args) {
        Smartphone Prime = new Smartphone( "Samsung", "Android");
        Prime.installApp("Message");
        Prime.installApp("Game");
        Prime.showApplication();
        Prime.uninstallApp("Game");
        Prime.showApplication();
        Prime.showBatteryLevel(0);
        Prime.showBatteryLevel(50);
        Prime.updateFirmware("Android 1");
        Smartphone Next = new Smartphone("iPhone","ios");
        Smartphone Dual = new Smartphone("Samsung", "Android");
        System.out.println("Prime.equals(Next) =" + Prime.equals(Next));
        System.out.println("Prime.equals(Dual) = " + Prime.equals(Dual));


    }
}
