import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber=sc.nextInt();
        
        System.out.print("Enter the secound number: ");
        int secoundNumber=sc.nextInt();
        
        int sum=0,multiples=1;
        
        if(firstNumber<secoundNumber)
        {
            while(firstNumber<=secoundNumber)
            {
                sum=sum+firstNumber;
                multiples=multiples*firstNumber;
                firstNumber++;
            }
        }
        else
        {
            while(secoundNumber<=firstNumber)
            {
                sum=sum+secoundNumber;
                multiples=multiples*secoundNumber;
                secoundNumber++;
            }
        }
        
        System.out.println("");
        
        System.out.println("Sum: "+sum);
        
        System.out.println("Multiples: "+multiples);
    }
    
}
