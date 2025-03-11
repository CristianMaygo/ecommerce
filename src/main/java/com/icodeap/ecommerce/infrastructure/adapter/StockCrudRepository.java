package com.icodeap.ecommerce.infrastructure.adapter;

import com.icodeap.ecommerce.infrastructure.entity.StockEntinty;
import org.springframework.data.repository.CrudRepository;

public interface StockCrudRepository extends CrudRepository<StockEntinty, Integer> {


}
