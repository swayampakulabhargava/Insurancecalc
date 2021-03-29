
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heman
 */
public class LifeInsuranceCost {
    
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = keyboard.nextInt();
       
        try{
            
        double lifeInsuranceCost = calculateInsurance(age);
        
        System.out.println("Your estimate is " + lifeInsuranceCost);
    }catch (InvalidAgeException ex) {
            System.out.println("The Age you entered is not valid!");
        }
     }

    /**
     *
     * @param age
     * @return
     * @throws InvalidAgeException
     */
    public static double calculateInsurance(int age) throws InvalidAgeException {
        if (age < 5 || age > 110) {
            throw new InvalidAgeException("Invalid age");
        }
        double TotalCost = (5 * age) + 300;
        return TotalCost;
    
    
}

   
    
}
