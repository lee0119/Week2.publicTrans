package week2;

public class PublicTransport {


    int number;
    int fuel;
    int speed ;
    int passenger;
    String state;


    public void checkMove(){
        System.out.println("운행중입니다.");
    }

    public void checkPassenger(){
        if(passenger > 45){
            System.out.println("탑승인원을 초과했습니다.");
        } else {
            System.out.println(passenger +" 명이 탑승중입니다.");
        }
    }

    public void checkFuel(){
        System.out.println("주유필요");
    }

    public void checkState(){
        System.out.println("운행중입니다.");
    }}