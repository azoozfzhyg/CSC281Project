public class Testing {
    
    public static int ecludianAlgorithm(int a, int b){// Abdulaziz
        if ( a % b == 0) {
            return b;
        }
        else {
            return ecludianAlgorithm(b, a % b);
        }
    }
    public static void main(String[] args) {
        System.out.println("the Gcd is: " + ecludianAlgorithm(3021, 510));
    }
}
