public class Bus extends Transport{
    public Bus(String brand, String model, int year, String color, String country, int speed) {
        super(brand, model, year, color, country, speed);
    }

    @Override
    public void refill() {
        System.out.println("Заправить бензином или дизелем");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
