package ITI.JETS.utils.mappers;

import ITI.JETS.entities.Product;
import ITI.JETS.services.dtos.requestdtos.SearchProductDTO;

public class SearchProductMapper {
    public SearchProductDTO mapProduct(Product p)
     {
        SearchProductDTO pDto = new SearchProductDTO();
        pDto.setCategory(p.getCategory());
        pDto.setProductName(p.getProductName());
        pDto.setProductDescription(p.getProductDescription());
        pDto.setPrice(p.getPrice());
        return pDto ;
     }
}
