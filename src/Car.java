public class Car extends Transport {
     String engine;
     String body;

     String autoNumber;
     int seat;

    public Car(String brand,String model,int year, String color, String country, int speed,String engine, String body, String autoNumber, int seat) {
        super(brand,model,year, color, country, speed);
        this.engine = engine;
        this.body = body;
        this.autoNumber = autoNumber;
        this.seat = seat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        if (engine == null || engine.isBlank()) {
            this.engine = "1,5L";
        } else {
            this.engine = engine;

        }

    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        if (body == null || body.isBlank()){
            this.body= "седан";
        } else {
            this.body=body;
        }
    }

    public String getAutoNumber() {
        return autoNumber;
    }

    public void setAutoNumber(String autoNumber) {
        this.autoNumber = autoNumber;
    }

    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        if (seat < 0) {
            this.seat = 1;
        } else {
            this.seat = seat;
        }
    }


    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", body='" + body + '\'' +
                ", autoNumber='" + autoNumber + '\'' +
                ", seat=" + seat +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }


    @Override
    public void refill() {
        System.out.println("можно заправить бензином");
        System.out.println("можно заправить дизелем");
        System.out.println("зарядить на специальных электропарковках, если это электрокар");


    }
}
