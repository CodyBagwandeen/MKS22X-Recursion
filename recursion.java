import java.util.ArrayList;
public class recursion {
  public static void main(String[] args) {

    System.out.println("sqrt()");
         System.out.println("-----------------------\n");

         System.out.println("sqrt(4, 0.00001)");
         System.out.println("EXPECTED: 2");
         System.out.println(sqrt(4, 0.00001));         // 2

         System.out.println("----");

         System.out.println("sqrt(8, 0.00001)");
         System.out.println("EXPECTED: ~2.8284");
         System.out.println(sqrt(8, 0.00001));         // ~2.8284

         System.out.println("----");

         System.out.println("sqrt(0, 0.00001)");
         System.out.println("EXPECTED: 0");
         System.out.println(sqrt(0, 0.00001));         // 0

         System.out.println("\n");

         System.out.println("fib()");
         System.out.println("-----------------------\n");

         System.out.println("fib(0)");
         System.out.println("EXPECTED: 0");
         System.out.println(fib(0));                   // 0

         System.out.println("----");

         System.out.println("fib(1)");
         System.out.println("EXPECTED: 1");
         System.out.println(fib(1));                   // 1

         System.out.println("----");

         System.out.println("fib(7)");
         System.out.println("EXPECTED: 13");
         System.out.println(fib(7));                   // 13

         System.out.println("makeAllSums()");
         System.out.println("-----------------------\n");

         System.out.println("makeAllSums(0)");
         System.out.println("EXPECTED: [0]");
         System.out.println(makeAllSums(0));           // [0]

         System.out.println("----");

         System.out.println("makeAllSums(1)");
         System.out.println("EXPECTED: [1, 0]");
         System.out.println(makeAllSums(1));           // [1, 0]

         System.out.println("----");

         System.out.println("makeAllSums(3)");
         System.out.println("EXPECTED: [0, 3, 2, 5, 1, 4, 3, 6]");
         System.out.println(makeAllSums(3));           // [0, 3, 2, 5, 1, 4, 3, 6]


  }

  public static double sqrt(double n, double tolerance){
    return sqrtH(n, 1,tolerance);
  }

  public static double sqrtH(double n, double guess, double tolerance) {
    double gtemp = guess * guess;
    double tol = guess * tolerance;
    if ( gtemp <= n + tol && gtemp >= n - tol) {
      return guess;
    } else {
      gtemp = ( n / guess + guess) / 2;
      return sqrtH(n, gtemp, tolerance);
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

    public static ArrayList<Integer> makeAllSums(int n) {
      ArrayList<Integer> List = new ArrayList<Integer>();
      sumsH(n, 0, List);
      return List;
    }

    public static void sumsH(int n, int sum, ArrayList<Integer> list){
      if( n == 0) {
        list.add(sum);
      } else {
        sumsH( n-1, sum, list);
        sumsH( n-1, sum + n, list);
      }

    }
}
