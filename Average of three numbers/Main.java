import java.util.*;
class Main {
	public static void main (String[] args) {
		int n1,n2,n3;
      Scanner in=new Scanner(System.in);
      n1=in.nextInt();
      n2=in.nextInt();
      n3=in.nextInt();
      int sum=n1+n2+n3;
      int average=sum/3;
      System.out.println(average);
	}
}