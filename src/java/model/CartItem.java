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
public class CartItem {
    
	private String quantity;
	private Customer customer;
	private Product product;
        private String price;
        private String description;
        
//        public CartItem(Product product) {
//        this.product = product;
//        quantity = 1;
//   }
       
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
        
        public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
        
//        public void incrementQuantity() {
//        quantity++;
//    }
//
//    public void decrementQuantity() {
//        quantity--;
//    }

    public double getTotal() {
        double amount = 0;
     //   amount = (this.getQuantity() * item.getPrice());
        return amount;
    }
//   public double getTotalCost() {
//        return dblTotalCost;
//    }
//    public void setTotalCost(double dblTotalCost) {
//        this.dblTotalCost = dblTotalCost;
//    }  
public String toString(){
        
  return "" + description+ ";" +quantity+";" +price+ "";
   
}
}
