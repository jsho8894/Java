package src.com.bit.day09;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        //다음 배열에 값을 +2씩하고 출력
        int[] su1 = {1,4,6,7,9};
        for(int i = 0; i<su1.length; i++){
            System.out.println(su1[i]+2);
        }
        System.out.print("\n---------------------------------\n");
        //다음을 오름차순으로 정렬하시오.
        int[] su2 = {7,2,4,8,3};
        Arrays.sort(su2);
        for(int i = 0; i<5; i++){
            System.out.println(su2[i]);
        }
        System.out.print("\n---------------------------------\n");
        //1~10중 홀수를 담는 배열을 생성후 출력하시오
        int[] su3 = new int[10];
        for(int i = 0; i<9; i++){
            su3[i] = i+1;
            if(su3[i]%2 != 0){
                System.out.println(su3[i]);
            }
        }
  
        int cnt = 0;
        for(int i = 0; i<11; i++){//홀수의 갯수를 구하고
            if(i%2==1){cnt++;}
        }
        int[] su5 = new int[cnt];
        int idx = 0;
        //홀수의 갯수를 카운트
        for(int i = 0; i<11; i++){           
                su5[idx++]=i;
                System.out.print(su5[i]);           
        }


		System.out.print("\n---------------------------------\n");
        //알파벳 대문자를 담는 배열을 만들고 출력하시오
        int[] su4 = new int[27];
        char intA = 'A';
        for(int i = 0; i < 26; i++){ 

                su4[i] = (char)(intA);
                System.out.print((char)su4[i]);
                intA +=1; 

        }
        char[] ch = new char['Z'-'A'+1];
        for(int i = 0; i<ch.length; i++){
            ch[i]=(char)('A'+i);
        }
        for(int i = 0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
    }
}