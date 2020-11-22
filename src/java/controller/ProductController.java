/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Fabrice
 */
import java.util.ArrayList;
import java.sql.*;

import model.Product;

public class ProductController {
    
    static Connection conn;
    static PreparedStatement ps;
    
    public ArrayList<Product> getAllProducts() {
		ArrayList<Product> productList = new ArrayList<Product>();
		
		try {
		conn = ConnectionController.getConnection();
		ps = conn.prepareStatement("select * from \"products\"");
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Product p = new Product();
			p.setId(rs.getString(1));
			p.setDescription(rs.getString(2));
			p.setPrice(rs.getString(4));
                      //  p.setImageData(imageData);
			productList.add(p);
		}
		} catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		return productList;
	}
}
