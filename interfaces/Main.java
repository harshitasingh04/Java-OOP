package interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();
        // car.brake();
        // car.accelerate();
        // car.start();
        // car.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
