
/********************************************
*	AUTHOR:	Prashanna 
* COLLABORATORS: 
*	LAST MODIFIED:	
********************************************/

/********************************************
*	Quipu
*********************************************
*	PROGRAM DESCRIPTION:
*	A user will enter a number between 0 and 999 and this program will display the number as a quipu.
*********************************************
*	ALGORITHM:
// math example
number is 352
hundreds is 3: 352/100 = 3
tens is 5 : 52/10 = 5( 352 % 100  = 52)
ones is 2: 2/1 = 2 (52 % 10 = 2)

// psuedocode
INPUT num  // 0-999
CALC hundrdsPlace = num / 100 
CALC remainder = num % 100
CALC tensPlace = remainder / 10 
CALC onesPlace = remainder % 10 



*	
*********************************************/
import java.util.Scanner;
public class Main
{

  /***** CONSTANT SECTION *****/
  public static final int QUIPU_WIDTH = 30;

  public static void main(String[] args)
  {
    /***** DECLARATION SECTION *****/
    Scanner input = new Scanner(System.in);
    int num;
    String again = "Y";

    /***** INITIALIZATION SECTION *****/
    
    
    /***** INTRO SECTION *****/
    System.out.println("Hello! This program turns any whole number between 0 and 999 into a digital Quipu.\n");

    while(again.equalsIgnoreCase("Y")){

    /***** INPUT SECTION *****/
    do{
      System.out.print("Please enter a number between 0 and 999: ");
      num = input.nextInt();

      if(num < 0 || num > 999){
        System.out.println("ERROR: please enter value between 0 - 999\n");
      }

    }while(num < 0 || num > 999);

    /***** PROCESSING SECTION *****/
    int hundredsPlace = num / 100;
    int remainder = num % 100;
    int tensPlace = remainder / 10;
    int onesPlace = remainder % 10;

    System.out.println("\nHundreds   = " + hundredsPlace);
    System.out.println("Tens       = " + tensPlace);
    System.out.println("Ones       = " + onesPlace);

    /***** OUTPUT SECTION *****/
    System.out.println("\nYour quipu:");
    printQuipu(hundredsPlace, tensPlace, onesPlace);

    System.out.print("\nWould you like to make another quipu? [Y/N]: ");
    again = input.next();
    System.out.println();

    }

    System.out.println("Goodbye!");
    
  }

  /***** STATIC METHODS *****/
  public static void printKnots(int numKnots){
    for(int i = 0; i < numKnots ; i++ ){
      UtilityBelt.printCentered(QUIPU_WIDTH, "*");
    }
  }

  public static void printQuipu( int hundreds, int tens, int ones){
    UtilityBelt.printCentered(QUIPU_WIDTH, "---");
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");

    // hundreds
    printKnots(hundreds);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");

    // tens
    printKnots(tens);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");

    // ones
    printKnots(ones);
    UtilityBelt.printCentered(QUIPU_WIDTH, "|");

    UtilityBelt.printCentered(QUIPU_WIDTH, "\u203E");
  }

}









