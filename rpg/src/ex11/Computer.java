package ex11;

public class Computer extends TangibleAsset{
	String makerName;
	
	
	//コンストラクタ
	public Computer
	(String name, int price, String color,String makerName, double weight) {
		super(name, price, color, weight);
		this.makerName = makerName;
	}
	//メソッド
	public String getmakerName() {
		return this.makerName;
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
