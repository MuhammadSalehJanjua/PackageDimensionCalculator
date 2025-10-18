import java.util.Scanner;
public class FindDimension {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter item size in cm: ");
 double size = sc.nextDouble();
 double length = size * 2, width = size * 1.5, height = size * 1.2;
 System.out.println("Package Dimensions: " + length + " x " + width + " x " + height);
 sc.close();
 }
}