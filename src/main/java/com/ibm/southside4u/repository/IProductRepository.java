package com.ibm.southside4u.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.ibm.southside4u.model.Product;

@Repository
public interface IProductRepository extends CrudRepository<Product, ID> {

	@Query("select p from Product p where p.productname= :name")
	public List<Product> findProductAttrByName(@Param("name") String name);
}
