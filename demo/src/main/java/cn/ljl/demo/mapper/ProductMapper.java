package cn.ljl.demo.mapper;

import cn.ljl.demo.domain.Product;
import org.springframework.stereotype.Repository;

@Repository(value = "productMapper")
public interface ProductMapper {

    Product selectByPrimaryKey();
}
