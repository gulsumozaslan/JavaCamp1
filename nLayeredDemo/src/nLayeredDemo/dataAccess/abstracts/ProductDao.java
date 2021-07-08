package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	
	Product get(int id);     //get isimli bir operasyon olsun. �r�n arayabilmek i�in. Bana bir id ver veritaban�nda bir �r�n bulup getireyim
	
	List<Product> getAll();     //�rn, bir markay� aratt���nda t�m �r�nlerinin gelmesi
	                       
	
}
//ProductDao : Product i�in veri eri�im interfacemiz olucak
//list arrayList'in base' i'. List yerine ArrayList de yaz�labilir. Dolay�s�yla arrayListi de tutuyor onu implemente eden ba�ka nesneleri de