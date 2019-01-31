public class recursion {
  public static void main(String[] args) {
    System.out.println(sqrt(100));
    System.out.println("Should be around 10 \n");
    System.out.println(sqrt(16));
    System.out.println("Should be around 4 \n");
    System.out.println(sqrt(225));
    System.out.println("Should be around 15 \n");
    System.out.println(sqrt(10000));
    System.out.println("Should be around 100 \n");
    System.out.println(sqrt(2));
    System.out.println("Should be around 1.4 \n");
    System.out.println(sqrt(1));
    System.out.println("Should be around 1 \n");
    System.out.println(sqrt(36));
    System.out.println("Should be around 6 \n");
    System.out.println(sqrt(49));
    System.out.println("Should be around 7 \n");
    System.out.println(sqrt(256));
    System.out.println("Should be around 16 \n");
  }

  public static double sqrt(double n){
    return sqrtH(n, 1);
  }

  public static double sqrtH(double n, double guess) {
    double gtemp = guess * guess;
    double tol = n * .00001;
    if ( gtemp <= n + tol && gtemp >= n - tol) {
      return guess;
    } else {
      gtemp = ( n / guess + guess) / 2;
      return sqrtH(n, gtemp);
    }

  }
}
