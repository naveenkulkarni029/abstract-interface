package org.nbk.abstraction.demo;

public abstract class Phone implements Electronics {

    @Override
    public void display() {
     System.out.println("DISPLAY");
        
    }
    
    public abstract void insertSIM();

}
