import java.util.Scanner;
public class QuadraticCongruences{
// prone to change

    public static int FindAlphaPrime(int prime, int d){
        int alpha = 0;
        return alpha;
    }

    public static void FindSolutions(int prime, int b, int Inverse, int alphaprime, int []solutions){
        return;
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

    public static boolean isprime (int num){
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
        
    public static int fermatsLittleTheorem(int prime, int d){
        int result = 0;
        return result;
    }
    //**//
//
    public static void main(String[] args) { //Faris
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please write the value of a: ");
        int a = input.nextInt();

        System.out.print("Please write the value of b: ");
        int b = input.nextInt();

        System.out.print("Please write the value of c: ");
        int c = input.nextInt();

        System.out.print("Please write the value of prime: ");
        int  prime = input.nextInt();
            
        int d = ( (int)Math.pow(b,2) ) - (4 * a * c);
        int y;
        int x;
        int alphaprime;
        int Inverse;
        int [] solutions = new int [2];

        if (a % prime == 0 && prime%2==1 && isprime(prime) == true){
            if (prime % d ==0){
                x= (-b / (2 * a));
                System.out.print("x = {" + x +"}");
            }
            else if( prime % d !=0 ){
                if(fermatsLittleTheorem(prime,d ) == -1){
                    System.out.print("NO SOLUTION");
                }
                else{
                    alphaprime = FindAlphaPrime(prime,d);
                    Inverse =  findInverse (prime, 2*a);
                    FindSolutions(prime, b, Inverse, alphaprime, solutions);
                    System.out.print("Solution 1= " + solutions[0]);
                    System.out.print("Solution 2= " + solutions[1]);
                }
            }
        }
        else {
            System.out.print("Sorry invalid inputs");
        }
    input.close();
    }
}
