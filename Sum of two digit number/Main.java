import java.util.*;
class Main {
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
      int number = in.nextInt();
      int n1 = number/10;
      int n2 = number%10;
      System.out.println(n1+n2);
	}
}