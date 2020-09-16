import java.util.Scanner;
/**
 * This program determines the subtotal, the taxes and the final order of a pizza depending on size
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for the user
    Scanner input = new Scanner(System.in);

    // define the amount for labour
    final double LABOUR = 0.75;
    // define the amount for power
    final double POWER = 0.99;

    // the message depending on diameter
    final int MESSAGE1 = 20;
    final int MESSAGE2 = 40;
    
    // ask user for the size of their pizza in cm 
    System.out.println("What is the size of the pizza (in cm):");
    int pizzaSize = input.nextInt();
    
    // determine how much a pizza will cost depending on the size of the pizza
    double pizzaCost = pizzaSize * 0.50 + LABOUR + POWER;
    System.out.println("Subtotal: $" + pizzaCost);

    // determine the taxes depending on the price of the pizza
    double pizzaTax = pizzaCost * 0.13;
    System.out.println("Taxes: $" + pizzaTax);

    // determine the total of the pizza
    double pizzaTotal = pizzaCost + pizzaTax;
    System.out.println("Total: $" + pizzaTotal);

    // determine the diameter of the pizza and respond accordingly
    if (pizzaSize <= MESSAGE1) {
      System.out.println("We are going to make you a cute little pizza!");
    } else if (pizzaSize <= MESSAGE2 && pizzaSize > MESSAGE1){
      System.out.println("This will be delicious!");
    } else if (pizzaSize > MESSAGE2){
      System.out.println("Woah, big pizza! You might need a truck to get this home!");
    }
  }
}
