/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day25.discussion.enumeration;

/**
 *
 * @author Mardyon
 */
public class MainMenu {
    
    enum Month{
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, 
        AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    }
    
    public static void main(String[] args) {
        
        Month currentMonth = Month.JANUARY;
        
        switch(currentMonth){
            
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("It's Winter");
                break;
        }
    }
}
