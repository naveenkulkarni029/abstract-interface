package org.nbk.abstraction.device.mobile;

import org.nbk.abstraction.accesories.PhoneAccesories;
import org.nbk.abstraction.device.Phone;

public class Samsung extends Phone implements PhoneAccesories {

    @Override
    public void insertSIM() {
	System.out.println("Insert Samsung Phone sim");
	
    }

    @Override
    public void externalMemory() {
	System.out.println("External Memory for Samsung Phone");
	
    }

}
