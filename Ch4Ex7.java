
package ch4ex7;
import java.util.Scanner;

public class Ch4Ex7 {

    
    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please input a 3 digit number");
        num=input.nextInt();
        input.close();
        
        System.out.println("The hundred-place digit is: "+num/100);
        num%=100;
        System.out.println("The ten-place digit is: "+num/10);
        num%=10;
        System.out.println("The one-place digit is: "+num);
        
    }
    
}
