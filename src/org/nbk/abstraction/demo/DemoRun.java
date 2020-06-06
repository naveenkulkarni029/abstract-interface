package org.nbk.abstraction.demo;

import org.nbk.abstraction.device.mobile.Samsung;

public class DemoRun {

    public static void main(String args[]) {

	Samsung samsung = new Samsung();
	samsung.display();
	samsung.insertSIM();
	samsung.externalMemory();

    }

}
