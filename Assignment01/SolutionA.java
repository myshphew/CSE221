import java.util.Scanner;
public class SolutionA {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i=0; i<testCases;i++){
            int value = sc.nextInt();
            if (value%2==0){
                System.out.println(value+" is an Even number.");
            } else {
                 System.out.println(value+" is an Odd number.");
            }
        }
    }
}