package Student_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MobileDevice {
    private List<String> application;
    private int batteryLevel;

    public MobileDevice() {
        this.application = new ArrayList<>();
        this.batteryLevel= 0;
    }

    public void installApp( String app){
        // Этот метод добавляет приложение в список установленных.
        application.add(app);
        System.out.println("Приложение " + app + " добавлена.");
    }
    public void uninstallApp(String app){
        // Этот метод удаляет приложение из списка.
        application.remove(app);
        System.out.println("Приложение " + app + " удалена.");
    }
    public void showBatteryLevel (){
        //Этот метод отображает текущий заряд батареи.

        Random random = new Random();
        batteryLevel = random.nextInt(0,101);

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
