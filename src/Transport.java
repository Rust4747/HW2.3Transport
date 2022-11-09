public abstract class Transport {

    String brand;
    String model;
    private int year;
    String color;
    private String country;
    int speed;

    public Transport(String brand, String model, int year, String color, String country, int speed) {
        setBrand(brand);
        this.model = model;
        this.year = year;
        setColor(color);
        this.country = country;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand==null || brand.isBlank()) {
            this.brand = "не указан";
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
        this.model = "не указан";
    } else {
        this.model = model;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null || color.isBlank()) {
            this.color = "белый";
        }else {
            this.color=color;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed<=0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
    }
    public abstract void refill ();
}
