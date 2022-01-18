package OOP;

public class ServiceStation {
    public void check(TransportServiceInterface vehicle) {
       vehicle.service();
    }
}

//public class ServiceStation {
//    public void check(Car car, Bicycle bicycle, Truck truck) {
//        if (car != null) {
//
//            @Avenirre Avenirre 22 hours ago
//            И здесь логика меняется под общий тип, у которого будет вызываться один и тот же метод.
//
//            @yperunov	Reply…
//            System.out.println("Обслуживаем " + car.getModelName());
//            for (int i = 0; i < car.getWheelsCount(); i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
//        } else if (truck != null) {
//            System.out.println("Обслуживаем " + truck.getModelName());
//            for (int i = 0; i < truck.getWheelsCount(); i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
//        } else if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.getModelName());
//            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
//                bicycle.updateTyre();
//            }
//        }
//    }
//}