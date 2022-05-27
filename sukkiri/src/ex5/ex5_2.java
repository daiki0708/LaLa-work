package ex5;

public class ex5_2 {

	public static void main(String[] args) {
		
		String title = "履歴書・職務経歴書送付";
		String address = "jp@japan";
		String text = "お世話になります。本メールに履歴書・職務経歴書を送付致しますのでご確認お願い致します。";
		
		email(title, address, text);

	}

	public static void email (String title, String address, String text){
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);	
	}
	
}
