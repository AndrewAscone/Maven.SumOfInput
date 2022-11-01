import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = input.nextInt();
        int total = sumOfNumbers(number);
        int totalGauss = gaussianSumOfNumbers(number);

        System.out.println("The total sum of numbers from 1 to " + number + " is: " + total);
        System.out.println("The total sum of numbers from 1 to " + number + " using Gaussian magic is: " + total);



    }
    
    static int sumOfNumbers(int n) {
        int result = 0;
        for (int i = 1; i <=n; i++){
            result += i;
        }
        return result;
    }
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        return (n * (n + 1))/2;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    
}
