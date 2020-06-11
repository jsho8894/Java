package src.com.bit.day09;

public class Ex03 {
        //default생성자는 접근 제한자가 public
        final static int su2 = 1111;//static일때 finer이면 기본적으로 값을 초기화해주어야합니다
        final int su;
        Ex03(int a){
            //객체는 생성됬습니다
            //객체생성시점에 하고싶은일을 입력하여 줍니다.
            //해당생성자의 호출은 객체 생성시
            //단 한번만 이루어 집니다.
            //////////////////////////////////////////
            //주로 필드의 초기화를 사용하여줍니다.
            su = a;

        }

    public static void main(String[] args) {
        //상수형 변수
        //이름 대문자로만 
        final int A;
        A = 1234;//변수의 초기화
        //a =2222;//변수 대입
        System.out.println(A);
        final double PI = 3.14;
        System.out.println(PI);
        Ex03 me = new Ex03(1111);
        Ex03 you = new Ex03(2222);
        /* me.su++;
        you.su++; */
        System.out.println(me.su);
        System.out.println(you.su);
    }
}