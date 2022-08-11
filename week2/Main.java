package week2;

public class Main {
    public static void main (String[] args){
        Bus bus = new Bus();
        Taxi taxi=new Taxi();

        bus.checkNumber(1);
        bus.checkPassenger(2);
        bus.currentFuel(-50);
        bus.currentFuel(10);
        System.out.println("운행중");
        bus.checkPassenger(45);

        bus.checkNumber(2);
        bus.checkPassenger(5);
        bus.currentFuel(-55);

        taxi.checkNumber(1);
        taxi.checkPassenger(2, "서울역", 2);
        taxi.currentFuel(-80);
        taxi.currentTfare(4000);
        taxi.checkPassenger(5, " ", 0);
        taxi.checkPassenger(3, "구로디지털단지역", 12);
        taxi.currentFuel(-20);
        taxi.currentTfare(14000);
        taxi.info();



    }
}