package day0528;

//�������� ���α׷�
//��������:
//1. id
//2. ����
//3. ����
//4. �뿩����
//5. �������(�뿩�� or no) > �̰� ���� ������ε� ����� ���� ������ �ƽôº� ��
//���α׷� ���
//1. �뿩
//2. �ݳ�
//3. ���� ���� ���
//		1.�뿩���� å ���
//		2.�뿩������ å ���
//		3.��ü å��� ���
//4.�����ڸ� ���ؼ� �⺻������ ����� å�� �뿩���� ��Ͽ� �ִ´�
public class BookVO {
	private int id;
	private String title;
	private String author;
	private int price;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
	
	
//	BookVO(){//�ʱ�ȭ
//		
//	}
	
	public boolean equals(Object o){
		if(o instanceof BookVO){//o�� BookVO�� ��ü���� üũ
			BookVO b = (BookVO) o;
			if (id == b.id) {
				return true;
			}
		}		
		return false;
	}
	
//	BookVO(int id1,String book,String name, int price1){
//		id = id1;
//		bookName = book;
//		author = name;
//		price = price1;
//	}
	public String toString() {
		return "id= " + id + ", title= " + title + ", author= " + author + ", price= " + price;
	}
}
