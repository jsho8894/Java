package src.com.bit.day11;
 class Lec13{
    public void func01(){
        System.out.println("Lec13 func01...");
    }
    private void func02(){
        System.out.println("private func02...");
    }
}
public class Ex13 extends Lec13{
    // public> protected >= default >private
    public void func01(){
        //super.func01();
        System.out.println("Ex13 func01...");
    }
    void func02(){
        System.out.println("Ex13 func02...");
    }
    public static void main(String[] args) {
        Ex13 me = new Ex13();
        me.func01();
        me.func02();
    }
}