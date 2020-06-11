package com.bit.mySelf01;
//StudentVO를 동적 할당하여
//배열의 크기와 상관없이 사용할 수 있게 해주는 클래스
public class StudentArrayUtil {
	//배열에 크기를 1 늘려주는 메소드
	private static StudentVO[] expand(StudentVO[] arr){
		StudentVO[] temp = new StudentVO[arr.length];
		for(int i = 0; i <arr.length; i++){
			temp[i] = arr[i];
		}
		arr = new StudentVO[temp.length +1];
		for(int i = 0; i<temp.length; i++){
			arr[i] = temp[i];
		}
		return arr;
	}
	public static StudentVO[] add(StudentVO[] arr , StudentVO s){
		arr = expand(arr);
		arr[arr.length -1] = s;
		return arr;
	}
	//배열에서 해당객체가 몇번째 인덱스인지 알려주는 메서드
	//객체를 비교 할떄는 비교연산자(==)가 아닌 메서드를 통해서 비교해야합니다
	//이유는 비교연산자는 필드의 저장된 값이 아닌 주소값 자체를 비교하기 떄문입니다
	//그러면 equals 메소드를 만들어봅니다.
	
	//몇번쨰 인덱스인지 확인할떄
	//만약에 우리 배열에 없는 애의 인덱스를 요구하게된다면.
	//배열에서 절대 존재할수 없는 음의 정수 인덱스를 주면됩니다.
	//음의 정수중에 가장 간단한 -1을 리턴하게 만들어주면됩니다.
	public static int indexOf(StudentVO[] arr, StudentVO s){
		for(int i = 0; i<arr.length; i++){
			if(s.equals(arr[i])){
				return i;
			}
		}
		return -1;	
	}
	//만약 배열에서 특정 객체를 제거하고 크기도 -1할려면
	//어떤절차를 걸쳐야 할까?
	//1.해당 배열에 그 객체가 존재하는지 체크합니다
	//	존재하지 않을경우 그냥 배열을 그대로 보내줍니다.
	//2.만약 존재할 시에는 기존 배열을 temp에 복사해줍니다
	//	다음으로 기존 배열의 크기를 하나 작게 새로 만듭니다
	//	템프의 내용을 복사하되 indexOf가 같을 시엔 복사하지 않습니다.
	public static StudentVO[] remove(StudentVO[] arr, StudentVO s){
		//먼저 S가 arr에 존재하는지 확인
		if(indexOf(arr,s) !=-1){
			int index = indexOf(arr, s);
			StudentVO[] temp = new StudentVO[arr.length];
			for(int i = 0; i<arr.length; i++){
				temp[i] = arr[i];
			}
			arr = new StudentVO[temp.length -1];
			for(int i = 0; i<temp.length; i++){
				if(i<index){
					arr[i] = temp[i];
				}else if(i>index){
					arr[i-1] = temp[i];
				}
			}
		}
		return arr;
	}
}
