package com.waa.minieappbackend.service;

import com.waa.minieappbackend.domain.Product;
import com.waa.minieappbackend.domain.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> findAll();

//    List<ProductDto> findAllDto();

    List<Product> findAllById(long id);

//    ProductDto findByIdDto(long id);

    void save(Product product);

    void deleteById(Long id);

    void updateById(Long id, Product updatedProduct);

//    List<PostDto> filterByPrice(String price);

    List<Product> findProductByTitle(String title);

}
