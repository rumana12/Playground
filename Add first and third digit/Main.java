import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
      int firstNumber = (int)number/100;
      int lastnumber = number%10;
      System.out.println(firstNumber+lastnumber);
        
	}
}