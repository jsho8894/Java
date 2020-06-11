package src.com.bit.day09;

public class Ex07 {
    public static void main(String[] args) {
        //1~6까지의 랜덤한 수로 배열만들기
        //중복없음
        int[] su = new int[6];
        

        for(int i = 0; i<su.length; i++){
            double random = Math.random();
            su[i] = (int)(random*(100))+1;

            for(int j = 0; j< i; j++){
                if(su[i]==su[j]){
                    i--;
                    break;
                }
            }
        }
        for(int i = 0; i<su.length; i++){
            System.out.println(su[i]);
        }
    }
}