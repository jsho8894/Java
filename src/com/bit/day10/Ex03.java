package src.com.bit.day10;

class Car {
    String model;
    int speed;
    int speedUp;
    int speedDown;
    int accel;
    int limit;

    Car(){
        this("티코",100,10);
    }
    Car(String model,int limit,int accel){
        this.model=model;
        this.limit=limit;
        this.accel=accel;
    }
    void speedUp(){
        if((speed+=accel)>limit){
            speed = limit;
        }
    }
    void speedDown(){
        if((speed-=accel)<0){
            speed = 0;
        }
    }
    void show(){
        System.out.println(model+"rk(이)"+speed+"km로 달린다.");
    }
    

}
public class Ex03 {
    public static void main(String[] args) {
        Car car = new Car("모닝",120,15);
        
        for (int i = 0; i<15; i++){
            car.speedUp();
            car.show();
        }
        for (int i = 0; i<15; i++){
            car.speedDown();
            car.show();
        }
    }
}