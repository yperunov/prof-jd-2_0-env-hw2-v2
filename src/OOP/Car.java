package OOP;

public class Car extends TransportWithMotor {
    public Car(String modelName) {
        super(modelName,4);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}