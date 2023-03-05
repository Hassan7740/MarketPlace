package ITI.JETS.services.dtos.requestdtos;

import java.util.HashSet;
import java.util.Set;

import ITI.JETS.entities.Category;
import ITI.JETS.entities.Image;
import lombok.Data;

@Data
public class AddProductDTO {
    private Integer productId;
    private Category category;
    private String productName;
    private String productDescription;
    private int productAmount;
    private float price;
    // private Set<Image> images = new HashSet<Image>(0);
}
