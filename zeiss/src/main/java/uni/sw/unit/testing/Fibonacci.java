package uni.sw.unit.testing;

public class Fibonacci {


    public int Fibonacci(int n){
        if(n == 0) return 0;
        if (n==1) return 1;

        return Fibonacci(n-2) + Fibonacci(n-1);
    }
}
