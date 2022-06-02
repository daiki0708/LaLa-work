package ex11;

public class Book extends TangibleAsset {
	String isbn;
	
	
	//コンストラクタ
	public Book
	(String name, int price, String color,String isbn, double weight) {
		super(name, price, color, weight);
		this.isbn = isbn;
	}
	//メソッド
	public String getIsbn() {
		return this.isbn;
	}
	@Override
	public double getweight() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
	@Override
	public void setweight(double weight) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	

}
