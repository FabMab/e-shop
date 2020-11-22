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
import java.sql.*;

import controller.ConnectionController;

public class AddCustomer {

    static Connection conn;
    static PreparedStatement ps;

    public int insertCustomer(Customer c) {

        int status = 0;
        try {
            conn = ConnectionController.getConnection();
            ps = conn.prepareStatement("insert into \"customer\"(\"name\",\"username\",\"password\") values (?,?,?)");

            ps.setString(1, c.getName());
            ps.setString(2, c.getUsername());
            ps.setString(3, c.getPassowrd());

            status = ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

   public Customer getcustomerById(String id) {
		Customer c = new Customer();
		try {
		conn = ConnectionController.getConnection();
		ps = conn.prepareStatement("select * from \"customer\" where \"customer_id\"=?");
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			c.setUsername(rs.getString(1));
                        c.setName(rs.getString(2));
			c.setPassowrd(rs.getString(3));
		}
		} catch(Exception e) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		return c;
	}

}
