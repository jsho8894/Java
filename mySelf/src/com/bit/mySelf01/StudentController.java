package com.bit.mySelf01;

import java.util.ArrayList;
import java.util.List;

//컨트롤러는 UI에 VO값을 정제해서 보내주거나
//UI에서 입력반은 값을 VO에 담아 데이터 베이스에 보내주는역할을 합니다
//우리는 db가 없기떄문에 그냥 평균과 총점을 계산하는 메소드만 넣어줍니다.
public class StudentController {
	//실제 DI에서는 2가지 방법이 있습니다
	//생성자를 통한 DI
	//메소드를 통한 DI
	//그중 생성자를 통한 DI를 해보도록합니다
	//원리는 list는 우리가 필요할때마다
	//db에서 긁어와야 하지만 실제는 우리가 db가 없으므로
	//여기에 필드로 넣습니다
	//또한 다형성(polymorphism)을 활용하기 위해 data tepy을 ArrayList가 아닌 List로 넣습니다.
	List<StudentVO>list;
	public StudentController(List<StudentVO> list){
		//이 컨트롤러 클래스는 List<StudentVO> list에 의존적인 관계입니다
		//그렇다고해서 이 리스트를 어떻게 초기화 할지를 여기에 적어주면
		//만약 그 리스트가 변경이 가해지게 된다면 여기도 바꿔줘야됩니다.
		//하지만 외부에서 리스트를 주입하게됩나뎜 여기서는 그냥
		//초기화 코드만 있기때문에 그 주입받은 것은 그대로 쓰기만 하면됩니다.
		//이러한 주입이 바로 의존성 주입이됩니다.
		this.list = list;
	}
	public int calculateSum(StudentVO s){
		return s.getKorean() + s.getEnglish()+s.getMath();
	}
	public double calculateAverage(StudentVO s){
		return calculateSum(s)/30;
	}
	public StudentVO findbyId(StudentVO s){
		StudentVO result = null;
		if(list.indexOf(s) != -1){
			int index = list.indexOf(s);
			result = list.get(index);
		}
		return result;
	}
	public void add(StudentVO s){
		if(list.size()==0){
			s.setId(0);
		}else{
			int id = list.get(list.size() - 1).getId() +1;
			s.setId(id);
		}
		list.add(s);
	}
	public void set(StudentVO s){
		int index = list.indexOf(s);
		list.set(index,s);
	}
	public void remove(StudentVO s){
		list.remove(s);
	}
}
