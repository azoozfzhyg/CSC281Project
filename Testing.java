public class Testing {
    
    public static int ecludianAlgorithm(int a, int b){// Abdulaziz
        if ( a % b == 0) {
            return b;
        }
        else {
            return ecludianAlgorithm(b, a % b);
        }
    }

    public static void findLinearCombination(int a, int b, int[] factors){
        if(a % b == 0 ){
            return;
        }
        findLinearCombination(b, a%b, factors);
        int temp = 0;
        if(factors[0] == 0){
            factors[0] = 1;
            factors[1] = -1 * a/b;
        }
            else{
                temp = factors[0];
                factors[0] = factors[1];
            factors[1] = temp + ( factors[1] * ((-1)*a/b));
            }
            return;
    }

    public static void main(String[] args) {
        System.out.println("the Gcd is: " + ecludianAlgorithm(503, 25));
        int[] factors = new int[2];
        findLinearCombination(503, 25, factors);
        System.out.println("the factors are: " + factors[0] + "," + factors[1]+"\nthe inverse is: " + factors[1] + "\n");
    }
}
