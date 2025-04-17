package com.example.stockplus.repository;

import java.util.List;
import com.example.stockplus.entity.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stock", path = "stock")
public interface StockRepository extends MongoRepository<Stock,String> {
    Stock findByStockSymbol(String stockSymbol);
    List<Stock> findAll();
}
