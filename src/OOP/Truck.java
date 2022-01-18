package OOP;

public class Truck extends TransportWithMotor {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public Truck(String modelName) {
        super(modelName, 6);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
//        super.service();
//        checkTrailer();
    }
}