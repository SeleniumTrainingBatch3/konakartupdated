package com.atmecs.konakart.pathallocator;


import java.io.IOException;
import java.util.Properties;

import com.atmecs.konakart.Standardfile.Standardfile;
import com.atmecs.konakart.utils.ReadLocatorsfile;


public class PathallocatorValidation {
	Properties properties;
	String productvalidate;
	String productsearchdetail;

	
	
	public void getdata() throws IOException {
		properties=ReadLocatorsfile.loadProperty(Standardfile.Validation_config);
	setProductvalidate();
	setProductsearchdetail();
	}
	
	public String getProductvalidate() {
		return productvalidate;
	}

	public void setProductvalidate() {
		productvalidate = properties.getProperty("val.product.name");
	}
	public String getProductsearchdetail() {
		return productsearchdetail;
	}

	public void setProductsearchdetail() {
		productsearchdetail = properties.getProperty("val.product.searchdetail");
	}

	
}

