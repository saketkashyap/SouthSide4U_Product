package com.ibm.southside4u.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.ibm.southside4u.model.Product;

@Repository
public interface IProductRepository extends CrudRepository<Product, ID> {

}
