package ex3;
public class Ex3_7 {
    public static void main(String[] args) {
        System.out.println("文字を1文字入力してください。");
        String str1 = new java.util.Scanner(System.in).nextLine();

        System.out.println("文字を1文字入力してください。");
        String str2 = new java.util.Scanner(System.in).nextLine();

     if (str1.equals(str2)) {
         System.out.println("等しい");
     } else {
         System.out.println("違います");
     }
    }
}