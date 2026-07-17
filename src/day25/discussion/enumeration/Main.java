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
public class Main {
    
    public static void main(String[] args) {
        
        Day today = Day.SATURDAY;
        
        if(today == Day.MONDAY || today == Day.TUESDAY){
            System.out.println("Start of the week");
        }else if (today == Day.WEDNESDAY || today == Day.THURSDAY){
            System.out.println("It's midweek");
        }else if(today == Day.FRIDAY){
            System.out.println("Weekend is near");
        }else{
            System.out.println("Weekend!");
        }
        
    }
    
}
