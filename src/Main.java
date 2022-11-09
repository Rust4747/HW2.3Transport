import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {


        Car volvo = new Car("вольво","s80",2013,"черный","Швеция",0,"2.5L",
                "седан","Р645ОХ799",5);
        System.out.println(volvo);
        volvo.refill();
        System.out.println();

        Train lastochka = new Train("","В-901",2011," ","Россия", 301,3500,
                "","Белорусский вокзал","станция Минск",11);
        Train leningrad = new Train("","D-125",2019," ","Россия", 270,1700,
                "","Ленинградский вокзал","станция Ленинград-пассажирский",8);
        lastochka.refill();
        leningrad.refill();

        System.out.println(lastochka);
        System.out.println(leningrad);
        System.out.println();

        Bus kamaz = new Bus("Камаз","У-200",2015,"Синий","Россия",98);
        Bus maz = new Bus("маз","р33",2019,"Синий","Россия",110);
        Bus liaz = new Bus("Лиаз","5292",2018,"Синий","Россия",90);
        System.out.println(kamaz);
        System.out.println(maz);
        System.out.println(liaz);
        kamaz.refill();




    }
}