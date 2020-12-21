package metier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import metier.entities.Category;
import metier.entities.Product;

public class CatalogueMetierImpl implements ICatalogueMetier {

	private Map<Long, Category> categories = new HashMap<Long, Category>();
	private Map<Long, Product> products = new HashMap<Long, Product>();
	
	@Override
	public Category addCategory(Category c) {
		categories.put(c.getIdCategory(), c);
		return c;
	}

	@Override
	public Category updateCategory(Category c) {
		categories.put(c.getIdCategory(), c);
		return c;
	}

	@Override
	public boolean deleteCategory(Long idCat) {
		if (categories.get(idCat) != null) {
			categories.remove(idCat);
			return true;
		} else {
			throw new RuntimeException("Category not found");
		}
	}

	@Override
	public List<Category> listCategories() {
		return new ArrayList<Category>(categories.values());
	}

	@Override
	public Category getCategory(Long idCat) {
		return categories.get(idCat);
	}

	@Override
	public Product addProduct(Product p) {
		p.setCategory(getCategory(p.getCategory().getIdCategory()));
		products.put(p.getIdProduct(), p);
		return p;
	}

	@Override
	public Product updateProduct(Product p) {
		products.put(p.getIdProduct(), p);
		return p;
	}

	@Override
	public boolean deleteProduct(Long idProd) {
		if (products.get(idProd) != null) {
			products.remove(idProd);
			return true;
		} else {
			throw new RuntimeException("Product not found");
		}
	}

	@Override
	public List<Product> listProducts() {
		
		return new ArrayList<Product>(products.values());
	}

	@Override
	public List<Product> productsByCategory(Long idCat) {
		
		List<Product> prods = new ArrayList<Product>();
		
		for(Product p:products.values()) {
			if (p.getCategory().getIdCategory().equals(idCat)) {
				prods.add(p);
			}
			
		}
		return prods;
	}

	@Override
	public Product getProduct(Long idProd) {
		return products.get(idProd);
	}

	@Override
	public List<Product> productsByKeyword(String keyword) {
		List<Product> prods = new ArrayList<Product>();
		
		for(Product p:products.values()) {
			if (p.getNameProduct().contains(keyword));
			
		}
		return prods;
	}
	
	public void initializeCatalogue() {
		// Add Some categories
		addCategory(new Category(1L, "Computer", "computer.jpg"));
		addCategory(new Category(2L, "Printer", "printer.jpg"));
		addCategory(new Category(3L, "TV", "tv.jpg"));
		
		// Add some products
		addProduct(new Product(1L, "HP Pavilion 17-f227nf PC Portable", 650, "hp.jpg", getCategory(1L)));
		addProduct(new Product(2L, "Mac Book", 3500, "mac.jpg", getCategory(1L)));
		addProduct(new Product(3L, "Canon pixma MG 2440", 280, "canon.jpg", getCategory(2L)));
		addProduct(new Product(4L, "Samsung", 2500, "samsung.jpg", getCategory(3L)));
	}

}
