package src.com.bit.day10;

public class Ex06 {
 public static void main(String[] args) {
     int[] arr1 = {1,3,5,7,9};
     int[] arr2 = {1,3,5,7,9};
     int[] arr3 =new int[]{1,3,5,7,9};
     int[] arr4 =arr3;//배열의 옅은 복사 이경우 하나의 객체의 값을 변경하면 다른 배열의 값도 같이 변화합니다.
     arr4[2] = 10;
     System.out.println(arr1.toString());
     System.out.println(arr2.toString());
     System.out.println(arr3.toString());
     System.out.println(arr1==arr2);
     System.out.println(arr3==arr4);
     func01(arr3);
     for(int i =0; i<arr4.length; i++){
        System.out.println(arr3[i]);
     }

 }
 public static void func01(int[] su) {
         su[3]=1234;
}
}