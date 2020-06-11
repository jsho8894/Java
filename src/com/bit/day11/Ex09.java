package src.com.bit.day11;

class Father extends Object{
    int money=1000;
    void work(){
        this.money += 100;
        System.out.println("돈을 벌어온다");
    }
    void push(){
        money-=10;
    }
}
class Son extends Father{
    int money = 0;
    //메서드 오버라이드 자신 상속한 부모와 똑같은 메소드를 재정의를 하여 사용하는것을 오버라이드라고 합니다.
    void work(){
        money+=10;
        System.out.println("용돈을 받는다");
    }
}

public class Ex09{//자바의 상속은 하나밖에 할수가 없습니다.
    public static void main(String[] args) {
        Father fa =new Father();
        // System.out.println(fa.money);
        // fa.work();
        // fa.work();
        // fa.work();
        // fa.push();
        // System.out.println(fa.money);

        Son son = new Son();
        System.out.println("아들이 보유한 금액"+son.money);
        son.work();
        System.out.println("아들이 보유한 금액"+son.money);
        System.out.println("아버지가 보유한 금액"+fa.money);
        // System.out.println("-----------------------------");
        // Object obj = new Object();
        // System.out.println(obj.toString());
        // System.out.println(obj.hashCode());
        // System.out.println("-----------------------------");
        // Ex09 me =new Ex09();
        // System.out.println(me.toString());
        // System.out.println(me.hashCode());
    }
    // public String toString(){
    //     return "나 자신";
    // }
}