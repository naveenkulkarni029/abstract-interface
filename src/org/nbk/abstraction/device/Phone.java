package org.nbk.abstraction.device;

import org.nbk.abstraction.category.Electronics;

public abstract class Phone implements Electronics {

    @Override
    public void display() {
     System.out.println("DISPLAY");
        
    }
    
    public abstract void insertSIM();

}
