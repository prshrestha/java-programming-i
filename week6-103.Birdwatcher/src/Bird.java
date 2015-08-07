/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Bird {
    
    private String birdName;
    private String latinName;
    private int count;
    
    public Bird(String name, String latin, int count){
        this.birdName = name;
        this.latinName = latin;
        this.count = count;
    }
    
    public String getName(){
        return this.birdName;
    }
    
    public String getlatinName(){
        return this.latinName;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public String toString(){
        return this.birdName + " (" + this.latinName + "): " 
                + this.count + " observations";
    }
    
}
