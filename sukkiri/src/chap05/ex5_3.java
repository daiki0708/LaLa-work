package chap05;

public class ex5_3 {

	public static void main(String[] args) {
		
			String address = "jp@japan";
			String text = "お世話になります。本メールに履歴書・職務経歴書を送付致しますのでご確認お願い致します。";
			
			email(address, text);

		}

		public static void email (String address, String text){
			System.out.println(address + "に以下のメールを送信しました");
			System.out.println("件名: 無題");
			System.out.println("本文:" + text);
		}
		
		public static void  email (String title, String address, String text){
			System.out.println(address + "に以下のメールを送信しました");
			System.out.println("件名Dx: 無題");
			System.out.println("本文:" + text);
		}
			
	}

