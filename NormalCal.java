/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class NormalCal {
    Validation v = new  Validation();
    
    public void normalCalculate(){
        double memory = v.inputDouble("Enter number: ");
        while(true){
            String operator = v.inputOperator("Enter operator: ");
            if(operator.equals("=")){
                System.out.println("Result: " + memory);
                return;
            }
            if(operator.equals("/")){
                double number;
                do{
                    number = v.inputDouble("Enter number: ");
                    if(number == 0) System.out.println("Cannot divide 0!");
                }while(number == 0);
                memory /= number;
                System.out.println("Memory: " + memory);
                continue;
            }
            double number = v.inputDouble("Enter number: ");
            if(operator.equals("+")){
                memory += number;
                System.out.println("Memory: " + memory);
            }
            if(operator.equals("-")){
                memory -= number;
                System.out.println("Memory: " + memory);
            }
            if(operator.equals("*")){
                memory *= number;
                System.out.println("Memory: " + memory);
            }
            if(operator.equals("^")){
                memory = Math.pow(memory, number);
                System.out.println("Memory: " + memory);
            }
        }
    }
}
