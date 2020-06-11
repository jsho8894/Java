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

//����Ʈ���� �ش��ϴ� bookVO ��ü�� ���� id�� ���� ��Ҹ� �����ϴ� �޼ҵ�
	public BookVO retrieveBookVO(List<BookVO> list, BookVO b){
		int index = list.indexOf(b);
		return list.get(index);		
	}
	
//�� �뿩�Ǵ� å�� �����ָ� �κ��丮���� ��Ʈ�� �̵���Ű�� �޼���
	public void rentBookVO(BookVO b){//�Է�
		rentList.add(retrieveBookVO(inventoryList, b));
		inventoryList.remove(b);
	}
//�� �ݳ��ϴ� BookVO ��ü�� list���� �����ϴ� remove�޼���
	public void returnBookVO(BookVO b){
		inventoryList.add(retrieveBookVO(rentList, b));
		rentList.remove(b);
	}
//�ش� BookVO ��ü�� �뿩�������� �����ϴ� �޼���
	public boolean validateRentBookVO(BookVO b){
		return inventoryList.contains(b);
	}
//�ش� BookVO ��ü�� �ݳ��������� �����ϴ� �޼���
	public boolean validateReturnBookVO(BookVO b){
		return rentList.contains(b);
	}
//rentList�� inventoryList�� �ϳ��� ���ļ� �����ϴ� �޼ҵ�
	public List<BookVO> selecAll(){//��ü�� �����ݴϴ�.
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
	//�ݳ� ������ å�� �ִ��� Ȯ���Ѵ�.
	public boolean isRentEmpty(){
		return rentList.size() ==0;
	}
	//�뿩 ������ å�� �ִ��� Ȯ���Ѵ�.
	public boolean isInventoryEmpty(){
		return inventoryList.size() ==0;
	}
}
