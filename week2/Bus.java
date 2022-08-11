package week2;


public class Bus extends PublicTransport{

    int number;
    int fuel = 100;
    int speed = 0;
    int passenger;
    int passengerMax = 30;
    int fare = 1000;
    String state;


    public void checkNumber(int number){
        this.number =number;
        if(number >2){
            System.out.println(number + "번 버스는 없습니다.");

        }
        else{
            System.out.println(number + "번 버스 입니다.");
            System.out.println();
        }
    }


    public void checkPassenger(int passenger){
        this.passenger = passenger;
        if(passenger >passengerMax){
            System.out.println("탑승 인원을 초과했습니다.");
        }else{
            System.out.println(passenger+"명이 탑승중입니다.");
            System.out.println(passengerMax-passenger+"명이 탑승가능합니다.");
            System.out.println("요금= "+passenger*fare+"원");
        }
    }


    public void currentFuel(int fuel){
        this.fuel += fuel;
        System.out.println("현재 주유량"+this.fuel);
        if(this.fuel <10){
            System.out.println("차고지행.");
            System.out.println("주유필요");



        }

    }
    public void checkState(){
        System.out.println("운행중입니다.");





    }}