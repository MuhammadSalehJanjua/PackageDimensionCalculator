import java.util.Scanner;
public class FindDimension {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter the size of the item: "); 
        double itemSize = scanner.nextDouble(); 
        double padding = 2.0; 
 
        double packageDimension = itemSize + 2 * padding; 
 
        System.out.println("For an item of size: " + itemSize); 
        System.out.println("The required package dimension is: " + packageDimension); 
        scanner.close(); 
 }
}
 
