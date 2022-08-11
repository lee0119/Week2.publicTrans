package week2;


public class Taxi extends PublicTransport{
    int number;
    int fuel = 100;
    int passenger;
    int passengerMax = 4;
    int tfare = 1000;

    int distance;


    String destination;
    String state;

    public void checkNumber(int number) {
        this.number = number;
        if (number > 2) {
            System.out.println(number + "번 택시는 없습니다.");
        } else {
            System.out.println(number + "번 택시입니다.");
        }
    }

    public void checkPassenger(int passenger, String destination, int distance) {
        this.passenger = passenger;
        this.distance = distance;
        this.destination = destination;
        this.tfare = 3000;
        if (passenger > passengerMax) {
            System.out.println("탑승인원을 초과했습니다.");
        } else {
            System.out.println(passenger + " 명이 탑승중입니다.");
            System.out.println(passengerMax - passenger + " 명이 탑승가능합니다.");
            System.out.println("기본요금 = " + tfare + "원");
            System.out.println("목적지는 " + destination + "입니다.");
            System.out.println("목적지까지 거리는 " + distance + "Km입니다.");
            System.out.println("지불할 요금은 " + (tfare + (distance - 1) * 1000) + "원");
            System.out.println("운행중");
        }
    }

    public void currentFuel(int fuel) {
        this.fuel += fuel;
        System.out.println("현재주유량 " + this.fuel);
    }

    public void currentTfare(int tfare){
        this.tfare += tfare;
        System.out.println("누적요금 " + this.tfare + "원");
    }

    public void info(){
        int currentFuel;
        System.out.println("주유필요");
        int currentTfare;
        System.out.println("운행불가");
    }

}
