
package com.atmecs.konakart.pages;

import com.atmecs.konakart.helpers.Pageaction;
import com.atmecs.konakart.pathallocator.Pathallocator;
import com.atmecs.konakart.testbase.Testbase;

public class Konakarthome extends Testbase {
Pathallocator path = new Pathallocator();
public void home() {
	Pageaction.dropdown(driver, path.getProducttype(),"Computer Peripherals");
	Pageaction.sendkeys(driver, path.getProductsearch(), "logitech");
	Pageaction.click(driver, path.getSearch());
}
}
