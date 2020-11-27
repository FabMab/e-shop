/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Brice
 */
public class Product {
    
        private String id;
	private String description;
	private double price;
      //  private byte[]imageData;
        
        public Product() {
		this.id = id;
		this.description = description;
		this.price = price;
	}

        
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
        
//        public byte[] getImageData() {
//		return imageData;
//	}
//	public void setImageData(byte[] imageData) {
//		this.imageData = imageData;
//	}
}
