package OOP;

public class Bicycle extends TransportWithWheels {
    public Bicycle(String modelName) {
        super(modelName, 2);
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}