package metier.entities;

import java.io.Serializable;

public class Category implements Serializable {
	private Long idCategory;
	private String nameCategory;
	private String imageCategory;
	/**
	 * @return the idCategory
	 */
	public Long getIdCategory() {
		return idCategory;
	}
	/**
	 * @param idCategory the idCategory to set
	 */
	public void setIdCategory(Long idCategory) {
		this.idCategory = idCategory;
	}
	/**
	 * @return the nameCategory
	 */
	public String getNameCategory() {
		return nameCategory;
	}
	/**
	 * @param nameCategory the nameCategory to set
	 */
	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}
	/**
	 * @return the imageCategory
	 */
	public String getImageCategory() {
		return imageCategory;
	}
	
	/**
	 * @param imageCategory the imageCategory to set
	 */
	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
	}
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Category(Long idCategory, String nameCategory, String imageCategory) {
		super();
		this.idCategory = idCategory;
		this.nameCategory = nameCategory;
		this.imageCategory = imageCategory;
	}
	
	
	

}
