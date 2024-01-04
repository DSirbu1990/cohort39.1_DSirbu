package Student_code;

public class Smartphone extends MobileDevice implements Updatable{
        private String deviceModel;
        private String operatingSystem;

        public Smartphone (String deviceModel, String operatingSystem) {

            this.deviceModel = deviceModel;
            this.operatingSystem = operatingSystem;

        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Smartphone) || obj == null) {
            return false;
        }
        Smartphone object = (Smartphone) obj;
        boolean isModelSame = this.deviceModel.equals(object.deviceModel);

        return isModelSame;
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

    @Override
    public void updateFirmware(String version) {

        System.out.println("Операционная система обновлено до версии " + version + ".");

    }
}
