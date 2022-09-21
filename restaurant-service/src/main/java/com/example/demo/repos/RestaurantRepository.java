package com.example.demo.repos;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Restaurant;

public class RestaurantRepository implements CrudRepository<Restaurant> {
      
	private Connection con;
	public RestaurantRepository(Connection con) {
		super();
		this.con =con;
	}
	@Override
	public List<Restaurant> findAll() {
		
		List<Restaurant> restaurantList = new ArrayList<>();
		String sql="select * from test.restaurants";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
		    ResultSet rs = pstmt.executeQuery();
		    while(rs.next()) {
		    	int id =rs.getInt("restaurantId");
		    	String restaurantName=rs.getString("restaurantName");
		    	long pincode=rs.getLong("pincode");
		    	String cuisine=rs.getString("cuisine");
		    	Restaurant res=new Restaurant(id,restaurantName,pincode,cuisine);
		    	restaurantList.add(res);
		    }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return restaurantList;
	}



	@Override
	public String save(Restaurant obj) {
		String sql="insert into test.restaurants values(?,?,?,?)";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt =con.prepareStatement(sql);
			pstmt.setInt(1,obj.getId());
			pstmt.setString(2,obj.getRestaurantName());
			pstmt.setLong(3,obj.getPincode());
			pstmt.setString(4,obj.getCuisine());
			rowUpdated = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(rowUpdated!=1) {
        	return "Restaurant Not Added"; 
        }
        else {
        	return "Restaurant Added";
        		}
	}

	@Override
	public String delete(Restaurant obj) throws ElementNotFoundException {
		
		String sql="delete from test.restaurants where restaurantId=?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, obj.getId());
			rowUpdated=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        if(rowUpdated!=1) {
        	return "Restaurant Not Found"; 
        }
        else {
        	return "Restaurant Deleted";
        		}
		
	}



	@Override
	public boolean deleteById(int key) throws ElementNotFoundException {

		return false;
	}



	@Override
	public Restaurant findById(int key) throws ElementNotFoundException {

		return null;
	}



	@Override
	public int update(Restaurant obj) {

		String sql="update test.restaurants set restaurantName=?,pincode=?,cuisine=? where restaurantId=?";
		int rowUpdated=0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.getRestaurantName());
			pstmt.setLong(2, obj.getPincode());
			pstmt.setString(1, obj.getCuisine());
			pstmt.setInt(1, obj.getId());
			rowUpdated=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return rowUpdated==1?1:0;
		
	}
	@Override
	public boolean updateById(int key) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
