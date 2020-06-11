package src.com.bit.day10;

public class Ex01 {
    int su1 = 1234;

    public void func01(){
        int su1 = 1111;
        System.out.println("func01 run...");
        this.func02();//this를 사용하면 자기자신이 됩니다.
        System.out.println("su1="+su1);
    }
    public void func01(Ex01 ex){//컴파일 과정이 있는 Ex
        System.out.println("func01(param:me) run...");
        System.out.println(ex == this);
        System.out.println("su1="+su1);
        ex.func02();
    }
    public void func02(){
        System.out.println("func02 run...");
    }
    public Ex01 func03(Ex01 me){
        System.out.println("func03 run...");
        return me;
    }
    public Ex01 func04(){
        System.out.println("func04 run...");
        return this;
    }
    public static void main(String[] args) {
        Ex01 me = new Ex01();
        me.func04().func04().func04();
        //me.func03(me).func03(me).func03(me).func03(me).func03(me);
        //System.out.println(this);여기에서는 사용불가
    }
}