package ITI.JETS.utils.mappers;

import ITI.JETS.entities.Product;
import ITI.JETS.services.DTOS.RequestDTOS.AddProductDTO;

public class AddProductMapper {
	public AddProductDTO mapProduct(Product p)
     {
        AddProductDTO pDto = new AddProductDTO();

        pDto.setProductId(p.getProductId());
        pDto.setCategory(p.getCategory());
        pDto.setProductName(p.getProductName());
        pDto.setProductDescription(p.getProductDescription());
        pDto.setProductAmount(p.getProductAmount());
        pDto.setPrice(p.getPrice());
        return pDto ;
     }

     public Product mapProductDTO(AddProductDTO pDto)
     {
        Product p = new Product();

        p.setProductId(pDto.getProductId());
        p.setCategory(pDto.getCategory());
        p.setProductName(pDto.getProductName());
        p.setProductDescription(pDto.getProductDescription());
        p.setProductAmount(pDto.getProductAmount());
        p.setPrice(pDto.getPrice());
        return p ;
     }
}
