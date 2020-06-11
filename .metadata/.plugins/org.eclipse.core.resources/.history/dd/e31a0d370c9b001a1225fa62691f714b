package src.com.bit.day10;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        //로또생성기
        //1~45까지의 숫자 6
        //랜덤 중복x
        //오름차순
        int[] lotto = new int[7];//배열 선언 및 배열길이를 6으로 지정

        for(int i =0; i< lotto.length ;i++){//배열의 길이만큼 순서대로 진행
            double random = Math.random();//랜덤선언
            lotto[i] = (int)(random*(45))+1;   //범위를 지정한 랜덤한수를 지정한 배열길이만큼 입력        
            for(int j = 0; j<i-1; j++){//중복값 제거            
                if(lotto[j]==lotto[i]){
                    i--;
                    break;
                }
            }
        }

        for(int i = 0; i<lotto.length; i++){//오름차순 정렬후 출력
            Arrays.sort(lotto);
            System.out.println(lotto[i]);
        }






















    }    
}