public class Train extends Transport {

    int price;
    String travelTime;
    String departureStation;
    String finalStop;
    int wagon;

    public Train(String brand,String model,int year, String color, String country, int speed,int price, String travelTime, String departureStation, String finalStop, int wagon) {
        super(brand,model,year, color, country, speed);
        this.price = price;
        this.travelTime = travelTime;
        this.departureStation = departureStation;
        this.finalStop = finalStop;
        this.wagon = wagon;


    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price<0){
            this.price = 1;
        } else {
            this.price = price;
        }
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        if (travelTime == null || travelTime.isBlank()){
            this.travelTime = "";
        } else {
            this.travelTime = travelTime;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getWagon() {
        return wagon;
    }

    @Override
    public String toString() {
        return "Train{" +
                "price=" + price +
                ", travelTime='" + travelTime + '\'' +
                ", departureStation='" + departureStation + '\'' +
                ", finalStop='" + finalStop + '\'' +
                ", wagon=" + wagon +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    public void setWagon(int wagon) {
        if (wagon <= 0) {
            this.wagon = 1;
        } else {
            this.wagon = wagon;
        }
    }

    @Override
    public void refill() {
        System.out.println("заправить дизелем");


    }
}
