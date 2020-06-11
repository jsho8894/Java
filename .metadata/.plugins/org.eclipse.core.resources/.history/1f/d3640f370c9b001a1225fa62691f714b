package src.com.bit.day10;

public class Ex02 {
    int su;//생성자

    public Ex02(){
        this(1234);//this()같은경우에는 생성자에서만 존재할수있고 생성자의 최상단에 있어야합니다.객채를 생성시 객체가 할일을 찾지 못하기때문에 첫줄에 입력해주어야합니다
        //super();//위의 this중 하나만 사용해야 합니다.
        System.out.println(this);
    }

    public Ex02(int su){
        //객체생성
        System.out.println("객체를 생성되었습니다");
        this.su = su;
        System.out.println(this);
    }

    public static void main(String[] args) {
        Ex02 me = new Ex02();
        System.out.println(me);
        System.out.println("su="+me.su);
    }
}