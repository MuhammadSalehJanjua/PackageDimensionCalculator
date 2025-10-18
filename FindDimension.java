import java.util.Scanner;
public class FindDimension {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double itemSize = 0; 
        double padding = 2.0; 
 
        System.out.print("Enter the size of the item: "); 
        while (!scanner.hasNextDouble()) { 
            System.out.println("Invalid input. Please enter a number."); 
            scanner.next(); // Discard the invalid input 
            System.out.print("Enter the size of the item: "); 
        } 
        itemSize = scanner.nextDouble(); 
 
        double packageDimension = itemSize + 2 * padding; 
        System.out.println("For an item of size: " + itemSize); 
        System.out.println("The required package dimension is: " + packageDimension); 
        scanner.close(); 
 }
}
 
