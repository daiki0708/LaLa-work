package chap15;

public class Main560 {

	public static void main(String[] args) {
		String s1 = "Java programming";
		disp("s1の4文字目以降は");
		disp(s1.substring(3));
		disp("s1の4から8文字目は");
		disp(s1.substring(3, 8));
		
		disp(s1.replace("Java", "PHP"));
	}

	public static void disp(Object s) {
		System.out.println(s);
	   }
}
