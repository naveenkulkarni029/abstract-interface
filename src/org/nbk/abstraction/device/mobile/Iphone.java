package org.nbk.abstraction.device.mobile;

import org.nbk.abstraction.device.Phone;

public class Iphone extends Phone {

    @Override
    public void insertSIM() {
	System.out.println("Insert SIM for IPhone");
    }
    
    @Override
    public void registerSIM() {
        super.registerSIM();
    }

}
