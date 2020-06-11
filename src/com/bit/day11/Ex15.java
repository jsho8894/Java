package src.com.bit.day11;
class Lec15{
    void func01(){
        System.out.println("Lec15 func01");
    }
}
public class Ex15 extends Lec15{
    public void func01(){
        System.out.println("Ex15 func01");
    }
    public void func02(){
        System.out.println("Ex15 func02");
    }
    public static void main(String[] args) {
        //다형성
        Lec15 me =  new Ex15();
        me.func01();
        Ex15 you = (Ex15)me;
        Lec15 me2 = you;
        you.func02();
        System.out.println("------------------------");
        //Integer su = new Integer(1234);
        //Double su = new Double(3.14);
        //Integer su = Integer(1234);
        //Double su = Double(3.14);
        Number su = 4321;
        System.out.println("su ="+su);
        func03(3.14);
    }
    public static void func03(Number a){
        System.out.println(a);
    }
}