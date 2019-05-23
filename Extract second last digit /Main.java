import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int count =0;
        for(int i = number.length()-1; i>=0;i--){
          if(count ==1){
            System.out.println(number.charAt(i));
          }
          count++;
        }
	}
}