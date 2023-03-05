package ITI.JETS.services;

import org.springframework.beans.factory.annotation.Autowired;

import ITI.JETS.controllers.ResponseViewModel;
import ITI.JETS.entities.Product;
import ITI.JETS.reposrtories.ProductRepository;
import ITI.JETS.services.dtos.requestdtos.AddProductDTO;
import ITI.JETS.utils.mappers.AddProductMapper;

public class AddProductService {

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
}
