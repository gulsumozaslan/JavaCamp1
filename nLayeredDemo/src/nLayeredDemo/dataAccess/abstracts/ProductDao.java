package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	
	Product get(int id);     //get isimli bir operasyon olsun. ürün arayabilmek için. Bana bir id ver veritabanýnda bir ürün bulup getireyim
	
	List<Product> getAll();     //örn, bir markayý arattýðýnda tüm ürünlerinin gelmesi
	                       
	
}
//ProductDao : Product için veri eriþim interfacemiz olucak
//list arrayList'in base' i'. List yerine ArrayList de yazýlabilir. Dolayýsýyla arrayListi de tutuyor onu implemente eden baþka nesneleri de