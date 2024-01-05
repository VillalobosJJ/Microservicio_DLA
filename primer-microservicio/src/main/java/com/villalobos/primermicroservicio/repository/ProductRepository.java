package com.villalobos.primermicroservicio.repository;

import com.villalobos.primermicroservicio.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
