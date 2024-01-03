package Student_code;

public class Homework {
    public static void main(String[] args) {
        Smartphone Prime = new Smartphone( "Samsung", "Android");
        Prime.installApp("Message");
        Prime.installApp("Game");
        Prime.showApplication();
        Prime.deleteApp("Game");
        Prime.showApplication();
        Prime.showBatteryLevel(50);
        Prime.showBatteryLevel(0);



    }
}
