public class QuadraticCongruences{
// prone to change
    public static int FindAlphaPrime(int prime, int d){
        int alpha = 0;
        return alpha;
    }

    public static int[] FindSolutions(int prime, int a, int b, int c){
        int[] solutions = new int[2];
        return solutions;
    }

    //**// tougher problems
    public static int ecludianAlgorithm(int a, int b){// Abdulaziz
        if ( a % b == 0) {
            return b;
        }
        else {
            return ecludianAlgorithm(b, a % b);
        }
    }

    public static int findInverse(int prime, int b){// Abdulaziz
        int inverse = 0;
        return inverse;
    }
        // the first index is the coefficient of a, the second is the coefficient of b
    public static int[] findLinearCombination(int a, int b){
        int gcd = ecludianAlgorithm(a, b);
        
    }

    public static int fermatsLittleTheorem(int prime, int d){
        int result = 0;
        return result;
    }
    //**//
//
    public static void main(String[] args) {
        
    }
}