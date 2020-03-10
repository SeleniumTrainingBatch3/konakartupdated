package com.atmecs.konakart.pathallocator;


import java.util.Properties;

import com.atmecs.konakart.Standardfile.Standardfile;
import com.atmecs.konakart.utils.ReadLocatorsfile;



public class Pathallocator {
	Properties property;
	String Producttype;
    String Productsearch;
    String search;





	public String getSearch() {
		return search;
	}
	public void setSearch() {
		search = property.getProperty("loc.button.search");
	}
	public void getdata() throws Exception {
		property = ReadLocatorsfile.loadProperty(Standardfile.Locator_config);
		setProductsearch();
		setProducttype();
		setSearch();
	}
	public String getProducttype() {
		return Producttype;
	}
	public void setProducttype() {
		Producttype = property.getProperty("loc.dropdown.type");
	}
	public String getProductsearch() {
		return Productsearch;
	}
	public void setProductsearch() {
		Productsearch = property.getProperty("loc.search.product");
	}
}
