package metier.entities;

import java.io.Serializable;

public class Product implements Serializable {
	private Long idProduct;
	private String nameProduct;
	private double priceProduct;
	private String imageProduct;
	private Category category;
	/**
	 * @return the idProduct
	 */
	public Long getIdProduct() {
		return idProduct;
	}
	/**
	 * @param idProduct the idProduct to set
	 */
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	/**
	 * @return the nameProduct
	 */
	public String getNameProduct() {
		return nameProduct;
	}
	/**
	 * @param nameProduct the nameProduct to set
	 */
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	/**
	 * @return the priceProduct
	 */
	public double getPriceProduct() {
		return priceProduct;
	}
	/**
	 * @param priceProduct the priceProduct to set
	 */
	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}
	/**
	 * @return the imageProduct
	 */
	public String getImageProduct() {
		return imageProduct;
	}
	/**
	 * @param imageProduct the imageProduct to set
	 */
	public void setImageProduct(String imageProduct) {
		this.imageProduct = imageProduct;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Long idProduct, String nameProduct, double priceProduct, String imageProduct, Category category) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.imageProduct = imageProduct;
		this.category = category;
	}
	
	
	
	
	
	
}
