package guru.springframework.services.reposervices;

import guru.springframework.domain.Product;
import guru.springframework.repositories.ProductRepository;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben Novikov on February 2018
 */
@Service
@Profile({"springdatajpa", "jpadao"})
public class ProductRepositoryRepoImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired //implicit constructor injection doesn't work with @Profile annotation!!!
    public ProductRepositoryRepoImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<?> listAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add);
        return products;
    }

    @Override
    public Product getById(Integer id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return productRepository.save(domainObject);
    }

    @Override
    public void delete(Integer id) {
        productRepository.delete(id);
    }
}
