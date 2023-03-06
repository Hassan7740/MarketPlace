package ITI.JETS.services;

import org.springframework.beans.factory.annotation.Autowired;

import ITI.JETS.controllers.ResponseViewModel;
import ITI.JETS.entities.Product;
import ITI.JETS.reposrtories.ProductRepository;
import ITI.JETS.services.DTOS.RequestDTOS.AddProductDTO;
import ITI.JETS.services.DTOS.RequestDTOS.SearchProductDTO;
import ITI.JETS.utils.mappers.AddProductMapper;
import ITI.JETS.utils.mappers.SearchProductMapper;

public class ProductService {

    @Autowired
	ProductRepository productRepository;
    ResponseViewModel responseViewModel;
    AddProductMapper addProductMapper;

    public ResponseViewModel add(AddProductDTO pDto)
    {
        responseViewModel = new ResponseViewModel();
        // Product p = (Product) productRepository.saveAllAndFlush(pDto);
        Product p = new AddProductMapper().mapProductDTO(pDto);

        productRepository.saveAndFlush(p);

        return responseViewModel;
    }

    public ResponseViewModel search(String productName)
    {
        responseViewModel = new ResponseViewModel();
         Product p = new Product();
         SearchProductDTO pDto = new SearchProductMapper().mapProduct(p);
        productRepository.findProductByProductName(pDto.getProductName());

        return responseViewModel;
    }
}
