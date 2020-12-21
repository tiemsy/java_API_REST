package metier;

import java.util.List;

import metier.entities.Category;
import metier.entities.Product;

public interface ICatalogueMetier {
	// Category
	public Category addCategory(Category c);
	public Category updateCategory(Category c);
	public boolean deleteCategory(Long idCat);
	public List<Category> listCategories();
	public Category getCategory(Long idCat);
	
	// Product
	public Product addProduct(Product p);
	public Product updateProduct(Product p);
	public boolean deleteProduct(Long idProd);
	public List<Product> listProducts();
	public List<Product> productsByCategory(Long idCat);
	public List<Product> productsByKeyword(String keyword);
	public Product getProduct(Long idProd);
	
}
