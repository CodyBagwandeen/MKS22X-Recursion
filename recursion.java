public class recursion {
  public static void main(String[] args) {

    // testing for sqrt
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

    System.out.println(fib(0));
    System.out.println("Should be 1 \n");
    System.out.println(fib(1));
    System.out.println("Should be 1 \n");
    System.out.println(fib(5));
    System.out.println("Should be 5 \n");
    System.out.println(fib(10));
    System.out.println("Should be 55 \n");
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

  /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      return fibH(n, 0, 0, 1, 0);

    }

    public static int fibH(int n, int current, int ans, int prev, int prev2){
      if( n == current) {
        return ans;
      } else {
        // System.out.println(n);
        // System.out.println(current);
        // System.out.println(ans);
        // System.out.println(prev);
        // System.out.println(prev2 + "\n");
        return fibH(n , current + 1, ans + prev, ans, prev);
      }

    }
}
