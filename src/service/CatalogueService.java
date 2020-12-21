package service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import metier.CatalogueMetierImpl;
import metier.entities.Category;
import metier.entities.Product;

@Path("/catalogue")
@Produces(MediaType.APPLICATION_JSON+"; charset=UTF-8")
public class CatalogueService {

	private CatalogueMetierImpl metier;
	
	public CatalogueService() {
		metier = new CatalogueMetierImpl();
		metier.initializeCatalogue();
		
	}
	
	@GET
	@Path("/categories")
	public List<Category> getCategories() {
		return metier.listCategories();
	}
	
	@GET
	@Path("/category/{idCat}/products")
	public List<Product> productsByCat(@PathParam(value = "idCat")Long idCat) {
		return metier.productsByCategory(idCat);
	}
	
	@GET
	@Path("/products/{keyword}")
	public List<Product> productsByKeyword(@QueryParam(value = "keyword")String keyword) {
		return metier.productsByKeyword(keyword);
	}
	
}
