import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int starcount = 1; starcount <= n; starcount++)
    {
      System.out.println("*");
  }
}
}