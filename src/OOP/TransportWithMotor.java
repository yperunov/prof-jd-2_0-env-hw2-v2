package OOP;

public abstract class TransportWithMotor extends TransportWithWheels {

    public TransportWithMotor(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
//    public void service() {
//        super.service();
//        checkEngine();
//    }
}
