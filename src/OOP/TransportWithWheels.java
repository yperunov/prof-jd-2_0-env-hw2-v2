package OOP;

import java.util.Objects;

public abstract class TransportWithWheels implements TransportServiceInterface {
    private String modelName;
    private int wheelsCount;

    public TransportWithWheels(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransportWithWheels transport = (TransportWithWheels) o;
        return wheelsCount == transport.wheelsCount && modelName.equals(transport.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

//    public void service() {
//        System.out.println("Обслуживаем " + getModelName());
//        for (int i = 0; i < getWheelsCount(); i++) {
//            updateTyre();
//        }
//    }
}
