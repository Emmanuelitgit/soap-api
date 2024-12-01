package com.soapApi.soapApi.Respositories;

import com.soapApi.soapApi.Model.ProductEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long>{
}
