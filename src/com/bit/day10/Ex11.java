package src.com.bit.day10;

public class Ex11 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for(int i= 1; i<45; i++){
            ball[i]=i+1;
        }
        int temp;
        for(int i = 0; i<10000; i++){
            temp = ball[0];
            int ran =(int)(Math.random()*44)+ 1;
            ball[0]=ball[ran];
            ball[ran]=temp;
        }
        for(int i = 0; i<6; i++){
            System.out.println(ball[i]);
        }
        System.out.println("보너스 번호:"+ball[6]);
    }
}