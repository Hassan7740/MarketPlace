package ITI.JETS.services.DTOS.RequestDTOS;

import java.util.HashSet;
import java.util.Set;

import ITI.JETS.entities.Category;
import ITI.JETS.entities.Image;
import lombok.Data;

@Data
public class SearchProductDTO {
    private Category category;
    private String productName;
    private String productDescription;
    private float price;
    private Set<Image> images = new HashSet<Image>(0);
}
