/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validation v = new Validation();
        NormalCal nc = new NormalCal();
        BMICal bc = new BMICal();
        while(true){
            v.displayMenu();
            int option = v.inputInt("Please choice one option: ", 1, 3);
            switch (option){
                case 1:{
                    nc.normalCalculate();
                    break;
                }
                case 2:{
                    bc.displayBMI();
                    break;
                }
                case 3:{
                    return;
                }
            }
        }
    }
    
}
