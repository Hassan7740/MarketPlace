package ITI.JETS.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import ITI.JETS.controllers.ResponseViewModel;
import ITI.JETS.entities.Product;
import ITI.JETS.reposrtories.ProductRepository;
import ITI.JETS.services.DTOS.RequestDTOS.AddProductDTO;
import ITI.JETS.services.DTOS.RequestDTOS.SearchProductDTO;
import ITI.JETS.services.DTOS.RequestDTOS.UpdateProductDTO;
import ITI.JETS.utils.mappers.AddProductMapper;
import ITI.JETS.utils.mappers.SearchProductMapper;
import ITI.JETS.utils.mappers.UpdateProductMapper;
@Service
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

    public ResponseViewModel deleteProductById(@PathVariable Integer id){
		responseViewModel = new ResponseViewModel();
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			productRepository.deleteById(id);
			responseViewModel.setResponseBody("Product Deleted Successfully",HttpStatus.valueOf(200),"none");	
		}
		else{
			responseViewModel.setResponseBody("No such product",HttpStatus.valueOf(404),"none");	
		}
		return responseViewModel;
    }

    public ResponseViewModel updateProduct(AddProductDTO productDTO){
        responseViewModel = new ResponseViewModel();
        Product product = new UpdateProductMapper().mapProductDTO(productDTO);
        productRepository.save(product);
        responseViewModel.setResponseBody("product updated successfully",HttpStatus.valueOf(202),"updated");	
        return responseViewModel;
    }
}
