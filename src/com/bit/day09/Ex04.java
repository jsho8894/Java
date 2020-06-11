package src.com.bit.day09;

class Car{
    private String model;
    private int limit;
    private int speed;
    private int accel;

    Car(){
        model = "승용차";
        limit = 150;
        accel = 10;
    }

    Car(String name,int a,int b){
        model = name;
        limit = a;
        accel = b;
    }

    void speedUp(){
        if((speed+=accel)>limit){speed = limit;}
    }
    void speedDown(){
        if((speed-=accel)<0){speed = 0;}
    }
    void show(){
        System.out.println(model+"이(가)"+speed+"km로 달립니다.");
    }

}

public class Ex04 {
    public static void main(String[] args) {
        Car car = new Car();
        for(int i = 0; i <40; i++){
            car.speedUp();
            car.show();
        }
        for(int i = 0; i<40; i++){
            car.speedDown();
            car.show();
        }
        car = new Car("모닝",150,5);
        for(int i = 0; i <40; i++){
            car.speedUp();
            car.show();
        }
        for(int i = 0; i<40; i++){
            car.speedDown();
            car.show();
        }
        car = new Car("셀토스",180,15);
        for(int i = 0; i <40; i++){
            car.speedUp();
            car.show();
        }
        for(int i = 0; i<40; i++){
            car.speedDown();
            car.show();
        }
    }
}