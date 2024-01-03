package Student_code;
import java.util.ArrayList;
import java.util.List;
public class Smartphone {
        private String deviceModel;
        private String operatingSystem;
        private int batteryLevel;
        private List<String> application;

        // Конструктор класса Smartphone
        public Smartphone (String deviceModel, String operatingSystem) {
            this.deviceModel = deviceModel;
            this.operatingSystem = operatingSystem;
            this.batteryLevel = 0;
            this.application = new ArrayList<>();
        }

        // Метод установить Приложение(приложение): Добавляет приложение в список установленных.
        public void installApp (String appName) {
            application.add(appName);
            System.out.println("Приложение " + appName + " добавлена.");
        }

        // Метод удалить Приложение(приложение): Удаляет приложение из списка.
        public void deleteApp(String appName) {
            application.remove(appName);
            System.out.println("Приложение " + appName + " удалена.");
        }

        // Метод показатьЗарядБатареи(): Отображает текущий заряд батареи.
        public void showBatteryLevel (int batteryLevel) {

            if (batteryLevel>0) {
                System.out.println("Батарея заряжена до - " + batteryLevel + "%");
            }else {
                System.out.println("Батарея разряжена.");
            }
        }

        public String getDeviceModel() {
            return deviceModel;
        }

        public void setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
        }

        public String getOperatingSystem () {
            return operatingSystem;
        }

        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
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
