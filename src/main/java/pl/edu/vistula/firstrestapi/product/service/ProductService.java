package pl.edu.vistula.firstrestapi.product.service;

import org.springframework.stereotype.Service;
import pl.edu.vistula.firstrestapi.product.api.request.ProductRequest;
import pl.edu.vistula.firstrestapi.product.api.request.UpdateProductRequest;
import pl.edu.vistula.firstrestapi.product.api.response.ProductResponse;
import pl.edu.vistula.firstrestapi.product.domain.Product;
import pl.edu.vistula.firstrestapi.product.repository.ProductRepository;
import pl.edu.vistula.firstrestapi.product.support.ProductExceptionSupplier;
import pl.edu.vistula.firstrestapi.product.support.ProductMapper;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toProduct(request);
        Product saved = repository.save(product);
        return mapper.toProductResponse(saved);
    }

    public ProductResponse find(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return mapper.toProductResponse(product);
    }

    public ProductResponse update(Long id, UpdateProductRequest updateProductRequest) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        repository.save(mapper.toProduct(product, updateProductRequest));
        return mapper.toProductResponse(product);
    }

    public void delete(Long id) {
        Product product = repository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));
        repository.delete(product); // Obyekt uzatildi
    }
}