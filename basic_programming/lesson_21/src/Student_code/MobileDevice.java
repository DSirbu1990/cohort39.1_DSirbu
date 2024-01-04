package Student_code;

import java.util.ArrayList;
import java.util.List;

public class MobileDevice {
    private List<String> application;
    private int batteryLevel;

    public MobileDevice() {
        this.application = new ArrayList<>();
        this.batteryLevel= 0;
    }

    public void installApp( String app){
        application.add(app);
        System.out.println("Приложение " + app + " добавлена.");
    }
    public void uninstallApp(String app){
        application.remove(app);
        System.out.println("Приложение " + app + " удалена.");
    }
    public void showBatteryLevel (int batteryLevel){
        if (batteryLevel>0) {
            System.out.println("Батарея заряжена до - " + batteryLevel + "%");
        }else {
            System.out.println("Батарея разряжена.");
        }
    }
    public int getBattery () {

        return batteryLevel;
    }

    public void setBattery (int battery) {

        this.batteryLevel = battery;
    }

    public List<String> getApplication() {

        return application;
    }

    // Дополнительный метод для отображения всех приложений
    public void showApplication() {
        if (application.isEmpty()) {
            System.out.println("Нет приложений.");
        } else {
            System.out.println("Приложений:");
            for (String application : application) {
                System.out.println("- " + application);
            }
        }
    }
}
