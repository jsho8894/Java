package day0528;

import java.util.ArrayList;
import java.util.List;

public class BookController {
	private List<BookVO>inventoryList;
	private List<BookVO>rentList;	
	public BookController(List<BookVO> inventorylist,List<BookVO> rentlist){
		this.inventoryList = inventorylist;
		this.rentList = rentlist;
	}

//리스트에서 해당하는 bookVO 객체와 같은 id를 가진 요소를 리턴하는 메소드
	public BookVO retrieveBookVO(List<BookVO> list, BookVO b){
		int index = list.indexOf(b);
		return list.get(index);		
	}
	
//뷰어가 대여되는 책을 보내주면 인벤토리에서 렌트로 이동시키는 메서드
	public void rentBookVO(BookVO b){//입력
		rentList.add(retrieveBookVO(inventoryList, b));
		inventoryList.remove(b);
	}
//뷰어가 반납하는 BookVO 객체를 list에서 삭제하는 remove메서드
	public void returnBookVO(BookVO b){
		inventoryList.add(retrieveBookVO(rentList, b));
		rentList.remove(b);
	}
//해당 BookVO 객체가 대여가능한지 검증하는 메서드
	public boolean validateRentBookVO(BookVO b){
		return inventoryList.contains(b);
	}
//해당 BookVO 객체가 반납가능한지 검증하는 메서드
	public boolean validateReturnBookVO(BookVO b){
		return rentList.contains(b);
	}
//rentList와 inventoryList를 하나로 합쳐서 리턴하는 메소드
	public List<BookVO> selecAll(){//전체를 보여줍니다.
		List<BookVO> list = new ArrayList<BookVO>();
		list.addAll(inventoryList);
		list.addAll(rentList);
		return list;
	}
	
	public List<BookVO> selectInventory(){
		return inventoryList;
	}
	public List<BookVO> selectRentList(){
		return rentList;
	}
	//반납 가능한 책이 있는지 확인한다.
	public boolean isRentEmpty(){
		return rentList.size() ==0;
	}
	//대여 가능한 책이 있는지 확인한다.
	public boolean isInventoryEmpty(){
		return inventoryList.size() ==0;
	}
}
