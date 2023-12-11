import java.util.Random;

public class Order {
    private static final Random random = new Random();

    private int cargoWeight;
    private String destination;

    public Order() {
        this.cargoWeight = random.nextInt(41) + 10; // Random cargo weight between 10 and 50 tons
        this.destination = random.nextBoolean() ? "Gotham" : "Atlanta"; // Random destination
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public String getDestination() {
        return destination;
    }
}


