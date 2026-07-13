/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.discussion;

/**
 *
 * @author Mardyon
 */


//Model
public class Ballpen {
    
   // this -> refers to the current class object
   // data hiding -> making all the data members private
   // data validation ->data use setter and getter methods  
    private int id;
    private String brand; //pilot
    private String color; // black
    private double price;
    private double pointSize;
    
    //setter method / mutator method
    public void setId(int id){
        this.id = id;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setPointSize(double pointSize){
        this.pointSize = pointSize;
    }
    
    public int getId(){
        return id;
    }    
       
    public String getBrand(){
        return brand;
    }
    
     public String getColor(){
        return color;
    }
     
     public double getPrice(){
        return price;
    }

    public double getPointSize(){
        return pointSize;
    }
     
}
