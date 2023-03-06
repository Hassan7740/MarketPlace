package ITI.JETS.services.DTOS.RequestDTOS;

import ITI.JETS.entities.Category;
import lombok.Data;

@Data
public class UpdateProductDTO {
	private Integer productId;
    private Category category;
    private String productName;
    private String productDescription;
    private Integer productAmount;
    private Float price;
    // private Set<Image> images = new HashSet<Image>(0);
}
