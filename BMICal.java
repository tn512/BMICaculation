/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class BMICal {

    Validation v = new Validation();

    public double BMICalculate() {
        double weight = v.inputDoubleBMI("Enter Weight(kg): ", 0, Double.MAX_VALUE);
        double height = v.inputDoubleBMI("Enter Height(cm): ", 0, Double.MAX_VALUE);
        double bmi = weight * 10000 / (height * height);
        System.out.println("BMI number: " + bmi);
        return bmi;
    }

    public void displayBMI() {
        double bmi = BMICalculate();
        if (bmi < 19) {
            System.out.println("Under-standard.");
        } else if (bmi >= 19 && bmi < 25) {
            System.out.println("Standard.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight.");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("Fat-should lose weight.");
        } else {
            System.out.println("Very fat - should lose weight immediately.");
        }
    }
}
