package com.training.ifaces;



import java.util.List;


import com.training.exceptions.ElementNotFoundException;
import com.training.model.Restaurant;


public interface CrudRepository<T> {
	public String save(T obj);
	public List<Restaurant> findAll();
	public String delete(T obj) throws ElementNotFoundException;
	public boolean deleteById( int key) throws ElementNotFoundException;
	public T findById(int key) throws ElementNotFoundException;
	public int update(T obj);
	public boolean updateById( int key) throws ElementNotFoundException;
	

}
