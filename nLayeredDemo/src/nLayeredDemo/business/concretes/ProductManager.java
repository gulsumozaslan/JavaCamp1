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
		// iþ kodlarý

		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor");
			return;                                                            // ben bunun veriye eriþimine gitmesini istemiyorum, dön demek
		}                                                                      // Metot boþ return'ü gördüðü zaman aþaðý bakmaz bitirir.

		this.productDao.add(product);                                         // if'e girmezse kurallardan geçti demek, dolayýsýyla benim veri eriþimini
		this.loggerService.logToSystem("Ürün eklendi : " +product.getName());		                 // çaðýrmam gerek

		// HibernateProductDao dao = new HibernateProductDao();
		// dao.add(product);                                              Bunu yaparsam baðýmlý olurum bunun yerine Dependes injection yaparým
		                                             

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
