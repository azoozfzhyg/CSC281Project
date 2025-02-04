import java.util.Scanner;
public class QuadraticCongruences{
// prone to change

    public static int FindAlphaPrime(int prime, int d){
        int k = 0;
        double alphaprime = (d + prime * k);
        while((Math.sqrt(alphaprime) - ((int) Math.sqrt(alphaprime))) != 0){
            k += 1;
            alphaprime = (d + prime * k);
        }
        return (int) Math.sqrt(alphaprime);
    }

    public static void FindSolutions(int prime, int b, int Inverse, int alphaprime, int []solutions){
    	solutions[0] = ((b + (alphaprime)) * Inverse) % prime;
        if(solutions[0] < 0){
            solutions[0] += prime;
        }
    	solutions[1] = ((b - (alphaprime)) * Inverse) % prime;
        if(solutions[1] < 0){
            solutions[1] += prime;
        }
        return;
    }

    public static int ecludianAlgorithm(int a, int b){
        if ( a % b == 0) {
            return b;
        }
        else {
            return ecludianAlgorithm(b, a % b);
        }
    }

    public static int findInverse(int prime, int b) {
        int factors[] = new int[2];
        findLinearCombination(prime, b, factors);
        return factors[1];
    }

    // the first index is the coefficient of a, the second is the coefficient of b
    public static void findLinearCombination(int a, int b, int[] factors) {
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
        int result = (int) (Math.pow(d, (prime - 1)/2) % prime);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please write the value of a: ");
        int a = input.nextInt();

        System.out.print("Please write the value of b: ");
        int b = input.nextInt();

        System.out.print("Please write the value of c: ");
        int c = input.nextInt();

        System.out.print("Please write the value of prime: ");
        int  prime = input.nextInt();
            
        int d = (b*b) - ((((4) * a) * c));
        int x;
        int alphaprime;
        int Inverse;
        int [] solutions = new int [2];
        //
        if (a % prime != 0 && prime%2==1 && isprime(prime) == true){
            if (d % prime ==0){
                b = ((-1) * b) % prime;
                a = (2 * a) % prime;
                Inverse = findInverse(prime, a);
                x = ((-b * Inverse) % prime);
                System.out.print("x = {" + x +"}");
            }
            else if( d % prime !=0 ){
                if(fermatsLittleTheorem(prime,d ) == (-1)){
                    System.out.print("NO SOLUTION");
                }
                else{
                    alphaprime = FindAlphaPrime(prime,d) % prime;
                    Inverse =  findInverse (prime, (2 * a) % prime);
                    FindSolutions(prime, -b % prime, Inverse, alphaprime, solutions);
                    System.out.print("x ={" + solutions[0] + "," + solutions[1] + "}");
                }
            }
        }
        else {
            System.out.print("Sorry invalid inputs");
        }
    input.close();
    }
}
