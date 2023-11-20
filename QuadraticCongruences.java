import java.util.Scanner;
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

    public static int findInverse(int prime, int b) {// Abdulaziz
        int factors[] = new int[2];
        findLinearCombination(prime, b, factors);
        return factors[1];
    }

    // the first index is the coefficient of a, the second is the coefficient of b
    public static void findLinearCombination(int a, int b, int[] factors) {// Abdulaziz
        if (a % b == 0) {
            return;
        }
        findLinearCombination(b, a % b, factors);
        int temp = 0;
        if (factors[0] == 0) {
            factors[0] = 1;
            factors[1] = -1 * a / b;
        } else {
            temp = factors[0];
            factors[0] = factors[1];
            factors[1] = temp + (factors[1] * ((-1) * a / b));
        }
        return;
    }

    public static int fermatsLittleTheorem(int prime, int d){
        int result = 0;
        return result;
    }
    //**//
//
    public static void main(String[] args) {
        Scanner input = newScanner(System.in);
        
        Ststem.out.print("Please write the value of a");

        Ststem.out.print("Please write the value of a");

        Ststem.out.print("Please write the value of a");

        Ststem.out.print("Please write the value of a");


        
    }
}
