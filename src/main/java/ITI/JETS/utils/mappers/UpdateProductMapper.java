package ITI.JETS.utils.mappers;

import ITI.JETS.entities.Product;
import ITI.JETS.services.DTOS.RequestDTOS.AddProductDTO;
import ITI.JETS.services.DTOS.RequestDTOS.UpdateProductDTO;

public class UpdateProductMapper {
	public UpdateProductDTO mapProduct(Product product)
     {
        UpdateProductDTO updateProductDTO = new UpdateProductDTO();

        updateProductDTO.setProductId(product.getProductId());
        updateProductDTO.setCategory(product.getCategory());
        updateProductDTO.setProductName(product.getProductName());
        updateProductDTO.setProductDescription(product.getProductDescription());
        updateProductDTO.setProductAmount(product.getProductAmount());
        updateProductDTO.setPrice(product.getPrice());
        return updateProductDTO ;
     }

     public Product mapProductDTO(AddProductDTO productDTO)
     {
        Product product = new Product();

        product.setProductId(productDTO.getProductId());
        product.setCategory(productDTO.getCategory());
        product.setProductName(productDTO.getProductName());
        product.setProductDescription(productDTO.getProductDescription());
        product.setProductAmount(productDTO.getProductAmount());
        product.setPrice(productDTO.getPrice());
        return product ;
     }
}
