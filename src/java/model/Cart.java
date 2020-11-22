/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;


/**
 *
 */
public class Cart {
protected Hashtable items;   
    
    public Cart() {
        this.items = new Hashtable();
    
    }
    
//private ArrayList<CartItem> products =new ArrayList<>();
//double total;
    //public void addCartItem(String description, String quantity, String price)
//{
//  
//  CartItem cartItem = new CartItem();
//       
//    cartItem.setDescription(description);
//    cartItem.setPrice(price);
//    cartItem.setQuantity(quantity);
//    products.add(cartItem);
//    //calculateOrderTotal();
//   
// }
//  
// public void addCartItem(CartItem cartItem) {
//  products.add(cartItem);
// }
//    
//    
//    public ArrayList<CartItem> getItems() {
//
//        return products;
//    }
//    
//   public void setCartItems(ArrayList allCartItems) {
//  this.products = allCartItems;
// }
   
  public void addItem(String itemId,
    String desc,
    String price,
    int quantity) {

    String[] item = {itemId, desc, price, Integer.toString(quantity)};

    if (items.containsKey(itemId)) {

      String[] tmpItem = (String[])items.get(itemId);
      int tmpQuant = Integer.parseInt(tmpItem[3]);
      quantity += tmpQuant;
      tmpItem[3] = Integer.toString(quantity);
    }
    else {

      items.put(itemId, item);
    }
  }  
  
  public void updateQuantity(String itemId, int quantity) {

    if (items.contains(itemId)) {

      String[] tmpItem = (String[])items.get(itemId);
      tmpItem[3] = Integer.toString(quantity);
    }
  }
  
   public Enumeration getEnumeration() {

   return items.elements();
  }



public int getNumOfItems() {

    Enumeration enume = items.elements();
    String[] tmpItem;
    int numOfItems = 0;
    while (enume.hasMoreElements()) {

      tmpItem = (String[])enume.nextElement();
      numOfItems += Integer.parseInt(tmpItem[3]);
    }

    return numOfItems ;
  }
   
}
