package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {   

	void add(Product product);  //Neyi servis etmek istiyorsak o operasyonlarýmýz olsun
	
	List<Product> getAll();
}
