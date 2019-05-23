import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(square_of_num(n));
}
  public static int square_of_num(int a)
  {
    int sum = a*a;
    return sum;
  }
}
