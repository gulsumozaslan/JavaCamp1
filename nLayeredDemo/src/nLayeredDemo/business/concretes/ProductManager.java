package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;

	public ProductManager(ProductDao productDao,LoggerService loggerService) { // Daoyu constructor ile injecte ettik
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		// i� kodlar�

		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor");
			return;                                                            // ben bunun veriye eri�imine gitmesini istemiyorum, d�n demek
		}                                                                      // Metot bo� return'� g�rd��� zaman a�a�� bakmaz bitirir.

		this.productDao.add(product);                                         // if'e girmezse kurallardan ge�ti demek, dolay�s�yla benim veri eri�imini
		this.loggerService.logToSystem("�r�n eklendi : " +product.getName());		                 // �a��rmam gerek

		// HibernateProductDao dao = new HibernateProductDao();
		// dao.add(product);                                              Bunu yaparsam ba��ml� olurum bunun yerine Dependes injection yapar�m
		                                             

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
