/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import controller.ConnectionController;

/**
 *
 * @author Brice
 */
public class BasketImplement {
   
        static Connection conn;
	static PreparedStatement ps;
	
	public CartItem getproduct(String quantity) {
		CartItem b = new CartItem();
		try {
		conn = ConnectionController.getConnection();
		ps = conn.prepareStatement("select * from \"products\" where \"product_id\"=?");
		ps.setString(1, quantity);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			b.setQuantity(quantity);
		}
		} catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		return b;
	}

	public Product getProductById(String id) {
		Product p = new Product();
		try {
			conn = ConnectionController.getConnection();
			ps = conn.prepareStatement("select * from \"products\" where \"product_id\"=?");
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				p.setId(rs.getString(1));
				p.setDescription(rs.getString(2));
				p.setPrice(rs.getDouble(3));
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		return p;
	}
}
