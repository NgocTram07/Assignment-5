
package assignment_5;

//import java.util.Scanner;
import java.util.*;

public class Ex11 {
    public static void main(String[] args){
        Random random = new Random();
        int roll1=0, roll2=0, tries =0;
        do{
            roll1 = random.nextInt(6) + 1;
            roll2 = random.nextInt(6) + 1;
            tries++;
            System.out.println("Roll " + tries + ": " + roll1 + " and " + roll2);            
        } while(roll1 != roll2);
        System.out.println("You rolled doubles after " + tries + " tries!");
    }
}
